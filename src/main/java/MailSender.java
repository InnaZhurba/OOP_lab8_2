import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MailSender {
    private MailInfo mailInfo;

    public MailSender(MailInfo mailInfo){
        this.mailInfo = mailInfo;
    }

    public Boolean sendMail(){
        String text = mailInfo.generateMSG();
        String email = mailInfo.getEmail();

        System.out.println("We are sending on: "+email+" with message: "+text);
        return true;
    }
}
