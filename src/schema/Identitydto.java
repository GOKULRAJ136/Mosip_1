package schema;

import java.util.ArrayList;
import java.util.Map;

public class Identitydto {

    public boolean additionalProperties;
    public String type;
    public ArrayList required;
    public Map<String,ObjectProperties> properties;

    public Identitydto() {
    }

    public Identitydto(boolean additionalProperties, String type, ArrayList required, Map<String,ObjectProperties> properties) {
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

    public Map<String,ObjectProperties> getProperties() {
        return properties;
    }

    public void setProperties(Map<String,ObjectProperties> properties) {
        this.properties = properties;
    }
}
