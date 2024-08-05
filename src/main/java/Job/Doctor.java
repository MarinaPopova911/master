package Job;

public class Doctor extends Job implements HigherEducation, MedicalCertificate {
    public Document diplom;
    public Document sertificate;

    public Doctor(Document diplom, Document sertificate) {
        this.diplom = diplom;
        this.sertificate = sertificate;
    }

    public Document getDoc() {
        return diplom;
    }

    public Document getMedTypeDoc() {
        return sertificate;
    }

    @Override
    public String toString() {
        return String.format("доктор , %s серия %s номер: %s,  %s серия %s номер: %s", getMedTypeDoc().getTypeDoc(), getMedTypeDoc().getSerialDoc(), getMedTypeDoc().getNumberDoc(), getDoc().getTypeDoc(), getDoc().getSerialDoc(), getDoc().getNumberDoc());
    }
}