package Job;

import javax.print.Doc;

public class Cook extends Job implements medicalCertificate {
    public String nameJob;
    public String doc;

    public Cook(String nameJob) {
        this.nameJob = nameJob;
    }

    public Cook(String nameJob, Documents doc) {
        this.nameJob = nameJob;
        this.doc = String.valueOf(doc);
    }

    public String getMedTypeDoc() {
        Documents doc = new Documents();
        doc.setTypeDoc("cертификат");
        doc.setNumberDoc("6767");
        doc.setSerialDoc("I-5AC");
        return String.format(" документ: %s серия: %s номер: %s", doc.getTypeDoc(), doc.getSerialDoc(), doc.getNumberDoc());
    }

    @Override
    public String toString() {
        return nameJob + getMedTypeDoc();
    }
}