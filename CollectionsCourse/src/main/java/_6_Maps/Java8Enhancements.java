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

        //raplacing a value in a map
        ProductMap result2 =idToProduct.replace(1, new ProductMap(1,"Big Door",50));
        System.out.println(result2);
        System.out.println(idToProduct.get(1));

        //replaceAll
        idToProduct.replaceAll((key, oldProduct) ->
                new ProductMap(oldProduct.getId(), oldProduct.getName(), oldProduct.getWeight() + 10));
        System.out.println(idToProduct);
        System.out.println();

        //if the value is in a map - return it, if it is missing call this function and produce a new value
        ProductMap result4= idToProduct.computeIfAbsent(10, (id) -> new ProductMap(id, "Custom Product", 10));
        System.out.println(result4);
        System.out.println(idToProduct.get(10));

        System.out.println(idToProduct);

        //iterating a map with foreach
        idToProduct.forEach((key,value) ->
        {
            System.out.println(key+ " -> " +value);
        });

    }
}
