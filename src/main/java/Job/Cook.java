package Job;

public class Cook extends Job implements MedicalCertificate {
    public Document sertificate;

    public Cook(Document sertificate) {
        this.sertificate = sertificate;
    }

    public Document getMedTypeDoc() {
        return sertificate;
    }

    @Override
    public String toString() {
        return String.format("повар , %s серия %s номер: %s", getMedTypeDoc().getTypeDoc(), getMedTypeDoc().getSerialDoc(), getMedTypeDoc().getNumberDoc());
    }
}