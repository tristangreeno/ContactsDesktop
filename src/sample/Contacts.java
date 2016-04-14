package sample;

/**
 * Stores the information about each contact.
 * Allows initialization from the user entering text into their respective fields.
 * Will not initialize if any field is null.
 * Prints custom toString for formatting purposes.
 */
public class Contacts {
    private String name;
    private String number;
    private String email;

    public Contacts(String name, String number, String email){
        if(name != null && number != null && email != null) {
            this.name = name;
            this.number = number;
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        StringBuilder contactInfo = new StringBuilder();
        contactInfo.append(name).append(", ")
                .append(number).append(", ")
                .append(email);
        return String.valueOf(contactInfo);
    }
}
