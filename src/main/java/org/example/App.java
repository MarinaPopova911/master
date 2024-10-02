package org.example;

import com.mongodb.Function;
import com.mongodb.client.*;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;

/**
 * JDBC & MongoDB
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static <T> ArrayList<T> getDataFromDB(String sql, Function<ResultSet, T> function) throws SQLException, ClassNotFoundException {
        ArrayList<T> objects = new ArrayList<>();
        Class.forName("org.postgresql.Driver");
        try (
                Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/mydbpostgres", "postgres", "postgres");
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(sql);
        ) {
            {
                while (rs.next()) {
                    T object = function.apply(rs);
                    objects.add(object);
                }
            }
        }
        return objects;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ArrayList<Person> persDb = getDataFromDB("SELECT p.A_SURNAME, p.A_NAME, p.A_AGE FROM PERSON p", new Function<ResultSet, Person>() {
            @Override
            public Person apply(ResultSet resultSet) {
                try {
                    return new Person(resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getInt(3));
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        persDb.forEach(System.out::println);
       /* Class.forName("org.postgresql.Driver");
        try (
                Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/mydbpostgres", "postgres", "postgres");
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("INSERT INTO PERSON (A_OUID, A_SURNAME, A_NAME, A_AGE)\n" +
                            "SELECT 8, 'ПЕТРОВА', 'ИРИНА', 28;\n" +
                        "SELECT p.A_SURNAME, p.A_NAME, p.A_AGE FROM PERSON p");
        ) {
            {
                while (rs.next()) {
                    Person person = new Person(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getInt(3));
                    //logger.info(person.toString());
                    persDb.add(person);
                }
            }
        }
        logger.info(persDb.toString());*/

        String url = "mongodb://localhost:27017";
        MongoClient mc = MongoClients.create(url);
        MongoDatabase db = mc.getDatabase("mydatabase");
        MongoCollection<Document> collection = db.getCollection("mycollection");
        ArrayList<Document> docs = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            docs.add(new Document()
                    .append("_id", new ObjectId())
                    .append("name", persDb.get(i).getName())
                    .append("surname", persDb.get(i).getSurname())
                    .append("age", persDb.get(i).getAge()));
        }
        collection.insertMany(docs);
        FindIterable<Document> documents = collection.find();
        documents.forEach(System.out::println);
    }
}