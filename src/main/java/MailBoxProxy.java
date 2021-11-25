import lombok.Getter;

@Getter
public class MailBoxProxy implements MailBoxLib{
    private MailBox mailBox;

    public MailBoxProxy(MailBox mailBox){
        this.mailBox = mailBox;
    }
    @Override
    public void addMailInfo(MailInfo mailInfo) {
        mailBox.addMailInfo(mailInfo);
    }

    @Override
    public boolean sendAll() {
        return mailBox.sendAll();
    }
}
