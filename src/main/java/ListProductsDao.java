import java.util.ArrayList;
import java.util.List;

// This is our DAO (data access object, or 'data access class')
public class ListProductsDao implements Products {

    // list all the products, find a product by ID, create a product

    // This will list all the products in the database table
    private List<Product> products;

    // Constructor for this DAO class
    public ListProductsDao() {
        this.products = new ArrayList<>();

        // add some dummy data
        Product hammer = new Product();
        hammer.setId(1);
        hammer.setTitle("Hammer");
        hammer.setPriceInCents(3000);
        hammer.setDescription("A bad hammer");
        products.add(hammer);

        Product xbox = new Product();
        xbox.setId(2);
        xbox.setTitle("Xbox Series X");
        xbox.setPriceInCents(50000);
        xbox.setDescription("This will be more powerful than a gaming PC LULz.");
        products.add(xbox);

        Product chiaPet = new Product();
        chiaPet.setId(3);
        chiaPet.setTitle("1999 Vintage Chia Pet");
        chiaPet.setPriceInCents(100);
        chiaPet.setDescription("A useless product for ... something.");
        products.add(chiaPet);
    }

    // Implement our interface requirements (from Products.java)

    @Override
    public Product findById(long id) {
        // We want to return the 'Product' object for the ID passed in
        // This will return the full row in the database...
        // i.e. id | title | priceInCents | description (the full row)
        return products.get((int)id - 1); // Make it zero-indexed
    }

    @Override
    public long createProduct(Product product) {
        // Create a product and insert into our ArrayList (and eventually, the database)

        // assign an ID
        product.setId(products.size() + 1); // same as auto_increment; thus the ID will always be unique

        // add a new Product to the ArrayList
        products.add(product); // When we call the createProduct method, we are sending in a 'Product' type object. This will add that object to the ArrayList.
        return product.getId();
    }
}
