package schema;

import java.util.ArrayList;
import java.util.List;

public class Validators {
    public String langCode;
    public String validator;
    public List arguments;
    public String type;

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getValidator() {
        return validator;
    }

    public void setValidator(String validator) {
        this.validator = validator;
    }

    public List getArguments() {
        return new ArrayList<>(arguments);
    }

    public void setArguments(List arguments) {
        this.arguments = new ArrayList<>(arguments);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

