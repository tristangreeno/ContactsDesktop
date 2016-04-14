import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.Assert;
import org.junit.Test;
import sample.Contacts;

/**
 * Created by tristangreeno on 4/12/16.
 */
public class ContactsTest {
    @Test
    public void initializeContactsTest() {
        Contacts contacts = new Contacts("Jim", "999", "@mail.com");
        Assert.assertTrue("Constructor failed", contacts.getName().equals("Jim") &&
                contacts.getEmail().equals("@mail.com"));
    }

    @Test
    public void nullInitializer() {
        Contacts contacts = new Contacts("Jim", "999", null);
        try {
            contacts.getEmail();
            assert true;
        }catch(NullPointerException e){
            System.out.println("Null value detected.");
            assert false;
        }
    }

    @Test
    public void contactPrintTest() throws Exception {
        String name = "name";
        String phoneNumber = "num";
        String email = "email";

        StringBuilder contactInfo = new StringBuilder();
        contactInfo.append(name).append(", ")
                .append(phoneNumber).append(", ")
                .append(email);
        Assert.assertTrue("Logic fails", String.valueOf(contactInfo).equals("name, num, email"));
    }

    @Test
    public void addContact() {
        ObservableList<Contacts> contacts = FXCollections.observableArrayList();
        Contacts newContact = new Contacts("James", "09898", null);
        contacts.add(newContact);
        Assert.assertTrue("Initializer needs to not work", contacts.get(0).getName() == null);
    }

    @Test
    public void removeContact() {
        ObservableList<Contacts> contacts = FXCollections.observableArrayList();
        Contacts contact = new Contacts("Jame", "8787878", "@maliz.com");
        contacts.add(contact);
        Contacts contacts1 = new Contacts("A", "B", "C");
        contacts.add(contacts1);

        Assert.assertTrue("Contact not added", contacts.get(0).getName().equals("Jame"));

        contacts.remove(0);
        Assert.assertTrue("Contact not removed", contacts.get(0).getName().equals("A"));
    }

}