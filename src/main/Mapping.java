package main;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mapping.IdentityMapping;

import java.io.File;
import java.io.IOException;

public class Mapping {
    public static void main(String[] args)throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper om=new ObjectMapper();
        File jsonFile=new File("C:\\Users\\Gokulraj\\Documents\\GitHub\\SchemaValidationUtility\\assets//identity_mapping.json");
        IdentityMapping im=om.readValue(jsonFile,IdentityMapping.class);
        System.out.println(im.getDocuments().values());
    }
}