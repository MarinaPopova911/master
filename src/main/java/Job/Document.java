package Job;

public class Document {
    public String typeDoc;
    public String serialDoc;
    public String numberDoc;

    public Document(String typeDoc, String serialDoc, String numberDoc) {
        this.typeDoc = typeDoc;
        this.serialDoc = serialDoc;
        this.numberDoc = numberDoc;
    }
    public Document() {
    }
    public String getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(String typeDoc) {
        this.typeDoc = typeDoc;
    }

    public String getSerialDoc() {
        return serialDoc;
    }

    public void setSerialDoc(String serialDoc) {
        this.serialDoc = serialDoc;
    }

    public String getNumberDoc() {
        return numberDoc;
    }

    public void setNumberDoc(String numberDoc) {
        this.numberDoc = numberDoc;
    }
}