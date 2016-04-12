import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tristangreeno on 4/12/16.
 */
public class ContactsTest {
    @Test
    public void contactPrintTest() throws Exception {
        String name = "name";
        String phoneNumber = "num";
        String email = "email";

        StringBuilder contactInfo = new StringBuilder();
        contactInfo.append(name).append(", ")
                .append(phoneNumber).append(", ")
                .append(email);
        assertTrue("Logic fails", String.valueOf(contactInfo).equals("name, num, email"));
    }

}