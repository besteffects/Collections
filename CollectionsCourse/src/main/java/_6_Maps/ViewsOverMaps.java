package _6_Maps;

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

        final Set<Integer> ids =idToProduct.keySet();
        System.out.println(ids);

        ids.remove(1);
        System.out.println(idToProduct);
        System.out.println();

    }
}
