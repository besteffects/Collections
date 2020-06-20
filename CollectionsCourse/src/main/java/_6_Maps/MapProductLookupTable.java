package _6_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable {
   //Implementing lookup using Hashmap
    private final Map<Integer, ProductMap> idToProduct = new HashMap<>();

    @Override
    ////in the case there is not product with our id null will be returned
    public ProductMap lookupById(int id) {
        return idToProduct.get(id);
    }

    @Override
    public void addProduct(final ProductMap productToAdd) {
        final int id = productToAdd.getId();
        //if id is already in the map throw exception
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
