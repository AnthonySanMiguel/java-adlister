package models;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class JDBCLecture {

    public static void main(String[] args) throws SQLException {

        // Instantiate a Config object
        Config config = new Config();

        // Set up our database driver and make a connection
        DriverManager.registerDriver(new Driver());

        // Get a connection object
        Connection conn = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword() // see, no passwords in plain text!
        ); // we now have a connection to our MySQL DB

        // ************ Create a Statement Object ************
        Statement stmt = conn.createStatement();

        // ************ Execute some sort of query ************
        // create a query string to get everything in the contacts table
        String contactsQuery = "SELECT * FROM contacts";

        ResultSet rs = stmt.executeQuery(contactsQuery);

        // display what's actually in the results set (rs) above
        while (rs.next()) {
            System.out.println(rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getString("phone_number"));
        }

        // If we want to add a row to our database, we will:
        // 1. Create a contact object (bean)
        // 2. Use our DAO to add our new contact using the SaveContact() method, and get the resulting ID
        // 3. Create a SQL Query to insert that Contact object into our database a a new row

        // this will allow us to use the methods defined in our DAO
        Contacts clDao = DaoFactory.getContactsDao();

        // Instantiate a new Contact object
        Contact casey = new Contact(
                "Casey",
                "Friday",
                "2105557777"
        );

        long newContactId = clDao.saveContact(casey); // id (for use in DB) of new contact
        Contact newlyCreatedContact = clDao.getContactById(newContactId);

        // INSERT INTO contacts (first_name, last_name, phone_number) VALUES ('casey', 'friday', '2105557777');

        String addContactQuery = String.format("INSERT contacts (first_name, last_name, phone_number) VALUES ('%s', '%s', '%s')",
                newlyCreatedContact.getFirstName(),
                newlyCreatedContact.getLastName(),
                newlyCreatedContact.getPhoneNumber(),
                newlyCreatedContact.getId()
        );

        System.out.println("This is the query string we'll be sending to MySQL");
        System.out.println(addContactQuery);

        // NOW let's actually execute this SQL query to add the new contact to our database
        stmt.executeUpdate(addContactQuery, Statement.RETURN_GENERATED_KEYS);

        // If we add Statement.RETURN_GENERATED_KEYS, we can work with the actual MySQL DB table row ID's and reassign those ID's to our Contact object here in our Java code

        long insertedRowId = 0;

        ResultSet ks = stmt.getGeneratedKeys();
        if (ks.next()) {
            insertedRowId = ks.getLong(1);
            System.out.println("The ID of the newly inserted row is: " + ks.getLong(1));
            System.out.println("Before doing the MySQL id check, " + newlyCreatedContact.getFirstName() + "'s id was: " + newlyCreatedContact.getId());

            // Check to see if the id was returned, or if insertedRowId is still at its default of '0'
            if (insertedRowId != 0)
                newlyCreatedContact.setId(insertedRowId);
        }
        System.out.println("After doing the MySQL id check, " + newlyCreatedContact.getFirstName() + "'s id was: " + newlyCreatedContact.getId());
    }
}
