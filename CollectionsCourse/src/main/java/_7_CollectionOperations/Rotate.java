package _7_CollectionOperations;

import _2_Arrays.Product;
import _3_Lists.ProductFixtures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rotate {
    public static void main(String[] args) {
        List<Product> products= new ArrayList<>();
        products.add(ProductFixtures.door);
        products.add(ProductFixtures.floorPanel);
        products.add(ProductFixtures.window);

        System.out.println(products);
        System.out.println();
//rotates a list by 1 element
        Collections.rotate(products,1);
        System.out.println(products);
        System.out.println();


        Collections.rotate(products, 1);
        System.out.println(products);
        System.out.println();

        Collections.rotate(products,1);
        System.out.println(products);

        //Rearranging the order randomly
        Collections.shuffle(products);
        System.out.println(products);

        //sorting. Takes a Comparator object for ordering
        Collections.sort(products, Product.BY_WEIGHT);
        System.out.println(products);

        Collections.sort(products, Product.BY_NAME);
        System.out.println(products);
    }
}
