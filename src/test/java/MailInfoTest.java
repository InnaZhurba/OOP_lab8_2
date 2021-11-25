import Client.Client;
import Client.Gender;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    MailInfo mailInfo = new MailInfo();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Client client = new Client();
        client.create("Inna",20, Gender.FEMALE);
        MailCode mailCode = MailCode.GREETINGS;
        mailInfo.setMailCode(mailCode);
        mailInfo.setClient(client);
    }

    @org.junit.jupiter.api.Test
    void generateMSG() {
        Assertions.assertEquals("Hello, Inna!\n", mailInfo.generateMSG());
    }

}