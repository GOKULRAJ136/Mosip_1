package schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Itemsdto {

    public boolean additionalProperties;
    public String type;
    public List<String> required;
    public Propertiesdto properties;

    public Itemsdto (){}

    public Itemsdto(boolean additionalProperties, String type, List<String> required, Propertiesdto properties) {
        this.additionalProperties = additionalProperties;
        this.type = type;
        this.required = new ArrayList<String>(required);
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

    public List<String> getRequired() {
        return required;
    }

    public void setRequired(List<String> required) {
        this.required = required;
    }

    public Propertiesdto getProperties() {
        return properties;
    }

    public void setProperties(Propertiesdto properties) {
        this.properties = properties;
    }
}
