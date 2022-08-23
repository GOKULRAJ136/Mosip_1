package schema;

import java.util.Map;

public class IdentitySchema {

    public String $schema;
    public String description;
    public boolean additionalProperties;
    public String title;
    public String type;

    public Definitiondto definitions;

    public Propertiesmaindto properties;

    public IdentitySchema (){}

    public IdentitySchema(String $schema, String description, boolean additionalProperties, String title, String type, Definitiondto definition, Propertiesmaindto properties) {
        this.$schema = $schema;
        this.description = description;
        this.additionalProperties = additionalProperties;
        this.title = title;
        this.type = type;
        this.definitions = definitions;
        this.properties = properties;
    }

    public String get$schema() {
        return $schema;
    }

    public void set$schema(String $schema) {
        this.$schema = $schema;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(boolean additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Definitiondto getDefinition() {
        return definitions;
    }

    public void setDefinition(Definitiondto definition) {
        this.definitions = definition;
    }

    public Propertiesmaindto getProperties() {
        return properties;
    }

    public void setProperties(Propertiesmaindto properties) {
        this.properties = properties;
    }
}
