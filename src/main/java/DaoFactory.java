// This DAO class will provide access to our Model data, but will not require accessing the ListAdsDao class directly
// Instead, we will reference the Interface

public class DaoFactory {

    private static Ads adsDao; // Interface

    public static Ads getAdsDao(){
        if(adsDao == null) {
            adsDao = new ListAdsDao(); // this is the ONLY reference to the ListAdsDao class
        }

        // if it is not null, return the adsDao that already exists
        // this is an instance of the ListAdsDao class
        return adsDao;
    }
}