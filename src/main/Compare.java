package main;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import schema.IdentitySchema;
import mapping.IdentityMapping;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class Compare {
    public static void main(String[] args)throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper om=new ObjectMapper();
        File mapping=new File("D:\\MosipProject\\assets\\identity_mapping.json");
        IdentityMapping im=om.readValue(mapping,IdentityMapping.class);
        File schema=new File("D:\\MosipProject\\assets\\identity_schema.json");
        IdentitySchema is=om.readValue(schema,IdentitySchema.class);
        Set<String> schemaObj=is.properties.identity.properties.keySet();
        for(String key:schemaObj){
            boolean val=false;
            Set<String> mappingObj = im.identity.keySet();
            for (String key1 : mappingObj) {
                Set<String> in = im.identity.get(key1).keySet();
                for (String s : in) {
                    if (im.identity.get(key1).get(s).equals(key)) {
                        System.out.println(key1 + " " + im.identity.get(key1));
                        System.out.println(key + " is existing in identity_mapping");
                        val=true;
                    }
                }
            }
            Set<String >map3=im.metaInfo.keySet();
            for(String s:map3){
                if(im.metaInfo.get(s).equals(key)){
                    System.out.println(s+" "+im.metaInfo.get(s));
                    val=true;
                }
            }
            Set<String >map4=im.audits.keySet();
            for(String s:map4) {
                if (im.audits.get(s).equals(key)) {
                    System.out.println(s + " " + im.audits.get(s));
                    val = true;
                }
            }
            Set<String > mappingObj2=im.documents.keySet();
            for (String key1:mappingObj2){
                Set<String > docIn=im.documents.get(key1).keySet();
                for (String s:docIn){
                    if(im.documents.get(key1).get(s).equals(key)){
                        System.out.println(key1 + " " + im.documents.get(key1));
                        System.out.println(key + " is existing in identity_mapping");
                        val=true;
                    }
                }
            }
            if(val==false) {
                System.out.println(key + " doesn't existing in identity_mapping");
            }else {
                continue;
            }
        }
    }
}