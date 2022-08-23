package schema;

import java.util.ArrayList;
import java.util.List;

public class ObjectProperties {
    public List<String> bioAttributes;
    public String fieldCategory;
    public String format;
    public String fieldType;
    public String $ref;
    public List<Validators> validators;
    public String type;
    public int minimum;
    public ObjectProperties(){

    }

    public List<String> getBioAttributes() {
        return bioAttributes;
    }

    public void setBioAttributes(List<String> bioAttributes) {
        this.bioAttributes = bioAttributes;
    }

    public String getFieldCategory() {
        return fieldCategory;
    }

    public void setFieldCategory(String fieldCategory) {
        this.fieldCategory = fieldCategory;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String get$ref() {
        return $ref;
    }

    public void set$ref(String $ref) {
        this.$ref = $ref;
    }

    public List<Validators> getValidators() {
        return new ArrayList<Validators>(validators);
    }

    public void setValidators(List<Validators> validators) {
        this.validators = new ArrayList<Validators>(validators);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}
