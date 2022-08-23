package schema;

import java.util.ArrayList;

public class Documentdto {

    public boolean additionalProperties;
    public String type;
    public ArrayList required;
    public Propertiesdto2 properties;

    public Documentdto(){}
    public Documentdto(boolean additionalProperties, String type, ArrayList required, Propertiesdto2 properties) {
        this.additionalProperties = additionalProperties;
        this.type = type;
        this.required = required;
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

    public ArrayList getRequired() {
        return required;
    }

    public void setRequired(ArrayList required) {
        this.required = required;
    }

    public Propertiesdto2 getProperties() {
        return properties;
    }

    public void setProperties(Propertiesdto2 properties) {
        this.properties = properties;
    }
}
