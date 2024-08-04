package Job;

public class Cook extends Job implements medicalCertificate{

    public Cook(String nameJob) {
        super(nameJob);
    }
    public String getMedTypeDoc() {
        Documents doc = new Documents();
        doc.setTypeDoc("Сертификат");
        return doc.getTypeDoc();
    }

    public String getMedSerialDoc() {
        Documents doc = new Documents();
        doc.setSerialDoc("II-3R");
        return doc.getSerialDoc();
    }

    public String getMedNumberDoc() {
        Documents doc = new Documents();
        doc.setNumberDoc("5555");
        return doc.getNumberDoc();
    }
}
