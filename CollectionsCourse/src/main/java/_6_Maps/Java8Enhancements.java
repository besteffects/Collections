package _6_Maps;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements {
    // public static void main(String[] args) {

    public static void main(String[] args) {


        final ProductMap defaultProduct = new ProductMap(-1, "Whatever the customer wants", 100);

        final Map<Integer, ProductMap> idToProduct = new HashMap<>();

        idToProduct.put(1, ProductFixturesMap.door);
        idToProduct.put(2, ProductFixturesMap.floorPanel);
        idToProduct.put(3, ProductFixturesMap.window);

        //this will print null
        ProductMap result = idToProduct.get(10);
        System.out.println(result);

        //null is substituted with default values
        ProductMap result1 = idToProduct.getOrDefault(10,defaultProduct);
        System.out.println(result1);
        System.out.println(idToProduct.get(10));
        System.out.println();
    }
}
