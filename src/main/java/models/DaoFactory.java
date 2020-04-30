package models;

import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    private static Contacts contactsDao;

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }
}
