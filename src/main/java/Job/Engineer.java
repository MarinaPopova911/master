package Job;

import javax.print.Doc;

public class Engineer extends Job implements HigherEducation {
    public Document diplom;

    public Engineer(Document diplom) {
        this.diplom = diplom;
    }

    public Document getDoc() {
        return diplom;
    }

    @Override
    public String toString() {
        return String.format("инженер , %s серия %s номер: %s", getDoc().getTypeDoc(), getDoc().getSerialDoc(), getDoc().getNumberDoc());
    }
}
