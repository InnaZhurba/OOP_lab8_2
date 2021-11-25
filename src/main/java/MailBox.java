import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.ArrayList;

@Getter @Setter
public class MailBox implements MailBoxLib{//розсилає
    private int ID;
    private ArrayList<MailSender> mailSender;

    private static int counter =0;
    public MailBox(){
        mailSender = new ArrayList<>();
        setID(counter);
        counter++;
    }
    public void addMailInfo(MailInfo mailInfo){
        mailSender.add(ID,new MailSender(mailInfo));
    }
    public boolean sendAll(){
        for(int i=0;i<getID();i++){
            if(!mailSender.get(i).sendMail())
                return false;
        }
        return true;
    }
}
