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

        //Printing with while:
//        while (productIterator.hasNext()){
//            Product product = productIterator.next();
//            System.out.println(product);
//        }

        //Printing with foreach
        for (Product product : products) {
            System.out.println(product);
        }


    }
}
