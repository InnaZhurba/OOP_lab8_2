import Client.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import Client.Gender;

class MailSenderTest {
    MailSender mailSender;

    @BeforeEach
    void setUp() {
        MailInfo mailInfo = new MailInfo();
        Client client = new Client();
        client.create("Inna",20, Gender.FEMALE);
        MailCode mailCode = MailCode.GREETINGS;
        mailInfo.setMailCode(mailCode);
        mailInfo.setClient(client);

        mailSender = new MailSender(mailInfo);
    }

    @Test
    void sendMail() {
        Assertions.assertTrue(mailSender.sendMail());
    }
}