import Client.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Client.Gender;

class MailBoxProxyTest {
    MailBoxManager mailBoxManager;
    @BeforeEach
    void setUp() {
        //MailSender mailSender;
        MailInfo mailInfo = new MailInfo();
        Client client = new Client();
        client.create("Inna",20, Gender.FEMALE);
        MailCode mailCode = MailCode.GREETINGS;
        mailInfo.setMailCode(mailCode);
        mailInfo.setClient(client);
        //mailSender = new MailSender(mailInfo);
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo);
        MailBoxProxy mailBoxProxy = new MailBoxProxy(mailBox);
        mailBoxManager = new MailBoxManager(mailBoxProxy);
    }

    @Test
    void sendAll() {
        assertTrue(mailBoxManager.sendNotifications());
    }
}