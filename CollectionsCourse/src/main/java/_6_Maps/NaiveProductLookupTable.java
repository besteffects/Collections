package _6_Maps;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable {
    private final List<ProductMap> products = new ArrayList<>();

    @Override
    public void addProduct(final ProductMap productToAdd) {
        final int uniqueId = productToAdd.getId();
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
        for (final ProductMap product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public void clear() {
        products.clear();
    }
}
