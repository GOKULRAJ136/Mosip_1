package schema;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Propertiesdto2 {

    public Map<String, List> refNumber;
    public Map<String,String> format;
    public Map<String,String> type;
    public Map<String,String> value;

    public Propertiesdto2 (){}

    public Propertiesdto2(Map<String, List> refNumber, Map<String, String> format, Map<String, String> type, Map<String, String> value) {
        this.refNumber = new HashMap<String, List> (refNumber);
        this.format = new HashMap<String, String> (format);
        this.type = new HashMap<String, String> (type);
        this.value = new HashMap<String, String> (value);
    }

    public Map<String, List> getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(Map<String, List> refNumber) {
        this.refNumber = refNumber;
    }

    public Map<String, String> getFormat() {
        return format;
    }

    public void setFormat(Map<String, String> format) {
        this.format = format;
    }

    public Map<String, String> getType() {
        return type;
    }

    public void setType(Map<String, String> type) {
        this.type = type;
    }

    public Map<String, String> getValue() {
        return value;
    }

    public void setValue(Map<String, String> value) {
        this.value = value;
    }
}
