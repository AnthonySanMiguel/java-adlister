import java.util.ArrayList;
import java.util.List;

// This is our DAO (data access object, or 'data access class')

public class ListAdsDao implements Ads {
    private List<Ad> ads;

    // list all the ads, find a ad by ID, create a ad

    // This will list all the ads in the database table

    public List<Ad> all() {
        if (ads == null) {
            ads = generateAds();
        }
        return ads;
    }

    // Constructor for this DAO class

    private List<Ad> generateAds() {
        List<Ad> ads = new ArrayList<>();

        // add some dummy data

        ads.add(new Ad(
            1,
            1,
            "playstation for sale",
            "This is a slightly used playstation"
        ));
        ads.add(new Ad(
            2,
            1,
            "Super Nintendo",
            "Get your game on with this old-school classic!"
        ));
        ads.add(new Ad(
            3,
            2,
            "Junior Java Developer Position",
            "Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript"
        ));
        ads.add(new Ad(
            4,
            2,
            "JavaScript Developer needed",
            "Must have strong Java skills"
        ));
        return ads;
    }

    // Implement our interface requirements (from Ads.java)

    @Override
    public List<Ad> all(long id) {
        return null;
    }

    @Override
    public Ad findById(long id) {
        // We want to return the 'Ad' object for the ID passed in
        // This will return the full row in the database...
        // i.e. id | userId | title | description (the full row)
        return ads.get((int)id - 1); // Make it zero-indexed
    }

    @Override
    public long createAd(Ad ad) {
        // Create a ad and insert into our ArrayList (and eventually, the database)

        // assign an ID
        ad.setId(ads.size() + 1); // same as auto_increment; thus the ID will always be unique

        // add a new ad to the ArrayList
        ads.add(ad); // When we call the createAd method, we are sending in a 'Ad' type object. This will add that object to the ArrayList.
        return ad.getId();
    }
}
