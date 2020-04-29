package models;

public class Contact { // elements below will be COLUMN NAMES for database table!!! (e.g. 'id', 'firstName', etc.)
    private long id; // Default starts @ "0"
                    // Best to use type 'long' rather than 'integer' as 'long' allows more values (4 billion+ rather than 2 billion)
                   // integer = -2 billion to 2 billion
                  // unsigned integer = 0 to 4 billion (no negative sign)
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // Constructor, Getters & Setters

    // zero-argument constructor
    public Contact() {}

    // assuming we only get first/last name and phone number
    public Contact (String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // assuming we get first/last/phone AND id
    public Contact(long id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
