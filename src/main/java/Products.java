public interface Products {

    // this method will return an object of type 'Product', searched by 'id'
    Product findById(long id);

    // this method will insert a 'Product' into our table, the return of this will be said product's ID
    long createProduct(Product product);

    // could add extra method requirements to update/delete/etc.
    // e.g. deleteProduct(long id){}
    // e.g. updateProduct(Product product) {}
}
