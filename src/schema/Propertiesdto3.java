package schema;

import java.util.HashMap;
import java.util.Map;
public class Propertiesdto3 {

    public Map<String,String> format;
    public Map<String,String> version;
    public Map<String,String> value;

    public Propertiesdto3 (){}

    public Propertiesdto3(Map<String, String> format, Map<String, String> version, Map<String, String> value) {
        this.format = new HashMap<String, String>  (format);
        this.version = new HashMap<String, String> (version);
        this.value = new HashMap<String, String> (value);
    }

    public Map<String, String> getFormat() {
        return format;
    }

    public void setFormat(Map<String, String> format) {
        this.format = format;
    }

    public Map<String, String> getVersion() {
        return version;
    }

    public void setVersion(Map<String, String> version) {
        this.version = version;
    }

    public Map<String, String> getValue() {
        return value;
    }

    public void setValue(Map<String, String> value) {
        this.value = value;
    }
}
