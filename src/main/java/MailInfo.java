import Client.Client;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public String generateMSG(){
    String text = mailCode.generateText();
        HashMap<String,String> map= new HashMap<>();
        map.put("%NAME%", client.getName());
        for(String key:map.keySet())
            text = text.replace(key,map.get(key));
        return text;
    }
    public String getEmail(){
        if(client==null)
            return null;
        return client.getEmail();
    }
}
