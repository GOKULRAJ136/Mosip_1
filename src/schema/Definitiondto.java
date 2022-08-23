package schema;

public class Definitiondto {
    public Simpledto simpleType;

    public Definitiondto definitions;
    public Documentdto documentType;
    public Biometricsdto biometricsType;

    public Definitiondto(){}

    public Definitiondto(Simpledto simpleType, Definitiondto definitions, Documentdto documentType, Biometricsdto biometricsType) {
        this.simpleType = simpleType;
        this.definitions = definitions;
        this.documentType = documentType;
        this.biometricsType = biometricsType;
    }

    public Simpledto getSimpleType() {
        return simpleType;
    }

    public void setSimpleType(Simpledto simpleType) {
        this.simpleType = simpleType;
    }

    public Definitiondto getDefinitions() {
        return definitions;
    }

    public void setDefinitions(Definitiondto definitions) {
        this.definitions = definitions;
    }

    public Documentdto getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Documentdto documentType) {
        this.documentType = documentType;
    }

    public Biometricsdto getBiometricsType() {
        return biometricsType;
    }

    public void setBiometricsType(Biometricsdto biometricsType) {
        this.biometricsType = biometricsType;
    }
}
