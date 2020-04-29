package models;

public class Config {

    // URL host for mySQL
    public String getUrl(){
        return "jdbc:mysql://localhost/contacts_db?serverTimezone=UTC&useSSL=false";
    }

    // mySQL username
    public String getUsername(){
        return "root";
    }

    // mySQL password
    public String getPassword(){
        return "@91Amq+119..<>";
    }
}
