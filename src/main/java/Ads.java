import java.util.List;

public interface Ads {

    // this method will return an object of type 'Ad', searched by 'id'
    Ad findById(long id);

    // this method will insert a 'Ad' into our table, the return of this will be said ad's ID
    long createAd(Ad ad);

    // could add extra method requirements to update/delete/etc.
    // e.g. deleteAd(long id){}
    // e.g. updateAd(Ad ad) {}

    List<Ad> all();
}
