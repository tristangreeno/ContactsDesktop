package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * The program has three text fields for the user to enter information about each contact.
 * If a field is empty, the contact will not be added.
 * Shows the user their contacts through a list view.
 * Writes all contacts to a JSON file after adding or removing a contact.
 */

public class Controller implements Initializable {
    private ObservableList<Contacts> contacts = FXCollections.observableArrayList();

    @FXML
    TextField name;
    @FXML
    TextField number;
    @FXML
    TextField email;

    @FXML
    ListView listView;

    public void addContact(){
        if(!name.getText().isEmpty() && !number.getText().isEmpty() && !email.getText().isEmpty()) {
            Contacts newContact = new Contacts(name.getText(), number.getText(), email.getText());
            contacts.add(newContact);
            name.setText("");
            number.setText("");
            email.setText("");
        }
    }

    public void removeContact(){
        Contacts contact = (Contacts) listView.getSelectionModel().getSelectedItem();
        contacts.remove(contact);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(contacts);
    }
}
