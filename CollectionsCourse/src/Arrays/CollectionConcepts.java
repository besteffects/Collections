package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<Product>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        // System.out.println(products);

        final Iterator<Product> productIterator = products.iterator();

        System.out.println("Printing with while:");
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            System.out.println(product);
        }

        //Printing with foreach
        System.out.println("Printing with foreach");
        for (Product product : products) {
            System.out.println(product);
        }

        //Print all products with weight >20
        System.out.println("Print all products with weight >20");
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() > 20) {
                System.out.println(product);
            } else {
                productIterator.remove(); //using iterator for removing elements from a collection
            }
        }
        System.out.println(products);
        //Size
        System.out.println("Collection size: " + products.size());
        System.out.println("Collection is empty (true/false): " + products.isEmpty());
    }

}
