package Job;

public class Engineer extends Job implements higherEducation {
    public String nameJob;
    public String doc;

    public Engineer(String nameJob) {
        this.nameJob = nameJob;
    }
    public Engineer(String nameJob, String doc) {
        this.nameJob = nameJob;
        this.doc = doc;
    }

    public String getDoc() {
        Documents doc = new Documents();
        doc.setTypeDoc("диплом");
        doc.setNumberDoc("1212");
        doc.setSerialDoc("II-12AA");
        return String.format(" документ: %s серия: %s номер: %s", doc.getTypeDoc(), doc.getSerialDoc(), doc.getNumberDoc());
    }
    @Override
    public String toString() {
        return nameJob + getDoc();
    }
}
