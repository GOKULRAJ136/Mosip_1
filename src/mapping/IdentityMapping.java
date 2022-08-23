package mapping;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapping {

    public Map<String,Map<String,String>> identity;
    public Map <String,String> metaInfo;
    public Map <String,String> audits;
    public  Map<String,Map<String,String>>  documents;
    public IdentityMapping(){}

    public IdentityMapping(Map<String,Map<String,String>> identity, Map<String, String> metalInfo, Map<String, String> audits, Map<String,Map<String,String>> documents) {
        this.identity = identity;
        this.metaInfo = new HashMap<String, String>(metaInfo);
        this.audits =new HashMap<String, String>(audits) ;
        this.documents = documents;
    }

    public Map<String,Map<String,String>> getIdentity() {
        return identity;
    }

    public void setIdentity(Map<String,Map<String,String>> identity) {
        this.identity = identity;
    }

    public Map<String, String> getMetaInfo() {
        return metaInfo;
    }

    public void setMetalInfo(Map<String, String> metaInfo) {
        this.metaInfo = metaInfo;
    }

    public Map<String, String> getAudits() {
        return audits;
    }

    public void setAudits(Map<String, String> audits) {
        this.audits = audits;
    }

    public Map<String,Map<String,String>> getDocuments() {
        return documents;
    }

    public void setDocuments(Map<String,Map<String,String>> documents) {
        this.documents = documents;
    }
}
