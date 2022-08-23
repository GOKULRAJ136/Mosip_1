package main;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import schema.IdentitySchema;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class Schema {
    public static void main(String[] args)throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper om=new ObjectMapper();
        File jsonFile=new File("C:\\Users\\Gokulraj\\Documents\\GitHub\\SchemaValidationUtility\\assets//identity_schema.json");
        IdentitySchema im=om.readValue(jsonFile,IdentitySchema.class);
        System.out.println(im.properties.identity.isAdditionalProperties());
    }
}