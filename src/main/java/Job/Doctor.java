package Job;

public class Doctor extends Job implements higherEducation, medicalCertificate {

    public Doctor(String nameJob) {
        super(nameJob);
    }

    public String getTypeDoc() {
        Documents doc = new Documents();
        doc.setTypeDoc("Диплом");
        return doc.getTypeDoc();
    }

    public String getSerialDoc() {
        Documents doc = new Documents();
        doc.setSerialDoc("I-5F");
        return doc.getSerialDoc();
    }

    public String getNumberDoc() {
        Documents doc = new Documents();
        doc.setNumberDoc("5656");
        return doc.getNumberDoc();
    }

    public String getMedTypeDoc() {
        Documents doc = new Documents();
        doc.setTypeDoc("Сертификат");
        return doc.getTypeDoc();
    }

    public String getMedSerialDoc() {
        Documents doc = new Documents();
        doc.setSerialDoc("II-5GF");
        return doc.getSerialDoc();
    }

    public String getMedNumberDoc() {
        Documents doc = new Documents();
        doc.setNumberDoc("99999");
        return doc.getNumberDoc();
    }
}
