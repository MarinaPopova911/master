package Job;

public class Doctor extends Job implements higherEducation, medicalCertificate {
    public String nameJob;
    public String doc;

    public Doctor(String nameJob) {
        this.nameJob = nameJob;
    }

    public Doctor(String nameJob, String doc) {
        this.nameJob = nameJob;
        this.doc = doc;
    }

    public String getDoc() {
        Documents doc = new Documents();
        doc.setTypeDoc("диплом");
        doc.setNumberDoc("1234");
        doc.setSerialDoc("II-12AA");
        return String.format(" документ: %s серия: %s номер: %s", doc.getTypeDoc(), doc.getSerialDoc(), doc.getNumberDoc());
    }

    public String getMedTypeDoc() {
        Documents doc = new Documents();
        doc.setTypeDoc("cертификат");
        doc.setNumberDoc("1111");
        doc.setSerialDoc("I-5AC");
        return String.format(" документ: %s серия: %s номер: %s", doc.getTypeDoc(), doc.getSerialDoc(), doc.getNumberDoc());
    }

    @Override
    public String toString() {
        return nameJob + getMedTypeDoc() + getDoc();
    }
}