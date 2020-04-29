package models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactListDao implements Contacts {

    // We need a List variable to hold all the models.Contacts
    private List<Contact> contacts = new ArrayList<>();

    // Could have seeded the DB table by pasting the stuff-seeder.sql code BELOW:
    // <-- ALTERNATIVELY, ENTER STUFF-SEEDER.SQL CODE HERE -->

    // List all the contacts (List<models.Contact>)
    @Override
    public List<Contact> getContacts() {
        return contacts;
    }

    // method for saving contacts
    // will essentially get length of List<models.Contact> and +1
    @Override
    public long saveContact(Contact contact) { // Variable "contact" of bean type "models.Contact"
        // check to see if this is the first contact, and if so, add 1 (ensures first contact created has an id of "1", not "0")
        if (contact.getId() == 0) {
            // If we are setting up a contact that hasn't been assigned an iD (so it must have been constructed using just 'first', 'last', and 'phone' -- NO ID, then we want to generate an ID and set it for this contact.
            contact.setId(contacts.size() + 1);
            contacts.add(contact);
        } else { // If the created contact's id is NOT 0 (we already have the correct ID coming from the MySQL table), so let's just set that contact in the ArrayList (contacts) with the iD that was passed in...
            contacts.set((int) contact.getId(), contact);
            // contacts.set(4, models.Contact casey) <-- Example with index ID and models.Contact name

            // contacts.set((int) 5, models.Contact casey);
            // in the array list
//            {yada: yada,
//            yadab:yadab,
//            5:casey}
        }

        // return the ID of the newly saved contact
        return contact.getId();
    }

    // method for deleting contacts
    @Override
    public void deleteContactById(long id) { // Not returning any data (deleting), thus a void method
        // don't need a return value
        // [1] -> John Smith *Index ID starts with 1 since we already took 0 into consideration...
        // [2] -> Dax Smith
        // [3] -> Webb Smith
        // [4] -> 1337 Smith
        // do a .remove on the passed in ID to remove that contact from the ArrayList
        contacts.remove((int) id - 1); // sending the index for the ARRAY LIST
    }

    // method for getting a contact by ID
    @Override
    public Contact getContactById(long id) { // Returning a type of models.Contact
        return contacts.get((int) id - 1);
    }

    // Let's test out our DAO to ensure everything is working properly
    public static void main(String[] args) throws SQLException {
        Contacts contactDao = new ContactListDao();

        // test the getContacts() method
        System.out.println("\n=== Testing getContacts()");
        List<Contact> allContacts = contactDao.getContacts();

        for (Contact contact : allContacts) {
            System.out.println(contact.getFirstName());
        }
    }
}
