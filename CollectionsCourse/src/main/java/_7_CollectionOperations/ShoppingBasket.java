package _7_CollectionOperations;

import _2_Arrays.Product;
import _3_Lists.ProductFixtures;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private final List<Product> items = new ArrayList<>();
    private int totalWeight = 0;

    public void add(Product product) {
        items.add(product);
        totalWeight += product.getWeight();
    }

    public List<Product> getItems() {
        return items;
    }

    public String toString() {
        return "Shopping Basket of \n" + items + "\nwith weight: " +
                totalWeight;
    }

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        basket.add(ProductFixtures.door);
        System.out.println(basket);
//adding a product directly into list of items
        //totalWeight is broken
        basket.getItems().add(ProductFixtures.window);
        System.out.println(basket);
    }
}
