package schema;

public class Biometricsdto {

    public boolean additionalProperties;
    public String type;
    public Propertiesdto3 properties;

    public Biometricsdto(){}

    public Biometricsdto(boolean additionalProperties, String type, Propertiesdto3 properties) {
        this.additionalProperties = additionalProperties;
        this.type = type;
        this.properties = properties;
    }

    public boolean isAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(boolean additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Propertiesdto3 getProperties() {
        return properties;
    }

    public void setProperties(Propertiesdto3 properties) {
        this.properties = properties;
    }
}