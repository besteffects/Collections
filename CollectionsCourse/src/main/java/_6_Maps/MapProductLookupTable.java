package _6_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable {
    private final Map<Integer, ProductMap> idToProduct = new HashMap<>();

    @Override
    public ProductMap lookupById(int id) {
        return idToProduct.get(id);
    }

    @Override
    public void addProduct(final ProductMap productToAdd) {
        final int id = productToAdd.getId();
        if (idToProduct.containsKey(id)) {
            throw new IllegalArgumentException(
                    "Unable to add product, duplicate id for: " + productToAdd);
        }
        //add elements to products map
        idToProduct.put(id, productToAdd);
    }

    @Override
    public void clear() {
        idToProduct.clear();
    }
}
