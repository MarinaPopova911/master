package Job;

public class Engineer extends Job implements higherEducation {

    public Engineer(String nameJob) {
        super(nameJob);
    }

    public String getTypeDoc() {
        Documents doc = new Documents();
        doc.setTypeDoc("Диплом");
        return doc.getTypeDoc();
    }

    public String getSerialDoc() {
        Documents doc = new Documents();
        doc.setSerialDoc("I-5S");
        return doc.getSerialDoc();
    }

    public String getNumberDoc() {
        Documents doc = new Documents();
        doc.setNumberDoc("4454545");
        return doc.getNumberDoc();
    }

}
