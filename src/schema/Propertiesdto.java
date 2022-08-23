package schema;

import java.util.HashMap;
import java.util.Map;

public class Propertiesdto {

    public Map <String,String> language;
    public Map <String,String> value;

    public Propertiesdto (){}

    public Propertiesdto(Map<String, String> language, Map<String, String> value) {
        this.language = new HashMap<String, String>(language);
        this.value = new HashMap<String, String>(value);
    }

    public Map<String, String> getLanguage() {
        return language;
    }

    public void setLanguage(Map<String, String> language) {
        this.language = language;
    }

    public Map<String, String> getValue() {
        return value;
    }

    public void setValue(Map<String, String> value) {
        this.value = value;
    }
}
