import java.io.Serializable;

// this is our Bean + Bean components (*THESE WILL BE THE COLUMNS IN THE DATABASE TABLE)

public class Ad implements Serializable {
    private long id;
    private long userId;
    private String title;
    private String description;

    // 1. Create our zero-argument constructor

    public Ad() { // We're doing this so the JVM can reserve space for this in memory
    }

    // Ad constructor

    public Ad(long id, long userId, String title, String description) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
    }

    // 2. Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
