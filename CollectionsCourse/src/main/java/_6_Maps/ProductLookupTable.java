package _6_Maps;

public interface ProductLookupTable {
    ProductMap lookupById(int id);

    void addProduct(ProductMap productToAdd);

    void clear();
}
