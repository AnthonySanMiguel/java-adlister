package models;

import java.sql.SQLException;
import java.util.List;

// Interface for our models.Contact (singular) bean [to be implemented by our Data Access Object "DAO"]

public interface Contacts {

    // List all the contacts (List<models.Contact>)
    List<Contact> getContacts() throws SQLException;

    // method for saving contacts
    // will essentially get length of List<models.Contact> and +1
    long saveContact(Contact contact); // Variable "contact" of bean type "models.Contact"

    // method for deleting contacts
    void deleteContactById(long id); // Not returning any data (deleting), thus a void method

    // method for getting a contact by ID
    Contact getContactById(long id); // Returning a type of models.Contact
}
