package _6_Maps;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable {
    //Implementing lookup using Arraylist
    //List of products which stores our products in
    private final List<ProductMap> products = new ArrayList<>();

    @Override
    public void addProduct(final ProductMap productToAdd) {
        //products have to be unique by their id
        final int uniqueId = productToAdd.getId();
//looking for duplicate product ids
        for (final ProductMap product : products) {
            if (product.getId() == uniqueId) {
                throw new IllegalArgumentException(
                        "Unable to add product, duplicate id for: " + productToAdd);
            }
        }

        products.add(productToAdd);
    }

    @Override
    public ProductMap lookupById(final int id) {
        //looking for a product id
        for (final ProductMap product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
//in the case there is not product with our id
        return null;
    }

    public void clear() {
        products.clear();
    }
}
