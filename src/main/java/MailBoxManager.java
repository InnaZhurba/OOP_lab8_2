public class MailBoxManager {
    private MailBoxLib mailBoxLib;

    public MailBoxManager(MailBoxLib mailBoxLib){
        this.mailBoxLib = mailBoxLib;
    }
    public boolean  sendNotifications(){
        return mailBoxLib.sendAll();
    }
}
