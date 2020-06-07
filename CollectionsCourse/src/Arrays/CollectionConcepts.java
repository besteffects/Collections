package Arrays;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection <Product> products = new ArrayList<Product>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        System.out.println(products);
    }
}
