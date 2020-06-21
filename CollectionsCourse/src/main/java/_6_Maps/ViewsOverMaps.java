package _6_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewsOverMaps {
    public static void main(String[] args) {
        final Map<Integer, ProductMap> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixturesMap.door);
        idToProduct.put(2, ProductFixturesMap.floorPanel);
        idToProduct.put(3, ProductFixturesMap.window);

        System.out.println(idToProduct);
        System.out.println();

        final Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);

        ids.remove(1);
        System.out.println(idToProduct);
        System.out.println();

        //ids.add(4); cannot add because I do not know what is the value of this key
//values aren't guaranteed to be unique, so we take a collection interface, not a set

        final Collection<ProductMap> productMaps = idToProduct.values();
        System.out.println(productMaps);
        System.out.println();

        productMaps.remove(ProductFixturesMap.floorPanel);
        System.out.println(productMaps);
        System.out.println(idToProduct);


        // productMaps.add(ProductFixtures.floorPanel); unsupported operation exception because a key is not known

        //entryset is a set of a key-value and tree elements
        final Set<Map.Entry<Integer, ProductMap>> entries = idToProduct.entrySet();

        for (Map.Entry<Integer, ProductMap> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue(ProductFixturesMap.floorPanel);
        }
        System.out.println(idToProduct);
    }
}
