package _3_Lists;

import _2_Arrays.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {
    private static int LIGHT_VAN_MAX_WEIGHT = 20;
    private final List <Product> products = new ArrayList<>();

    public void add(Product product) {
        //TODO
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct) {

    }

    public void prepare(){
        //TODO
    }

    public List<Product> getHeavyVanProducts (){return null;}
    public List<Product> getLightProducts(){return null;}
    public Iterator<Product> iterator(){
        return products.iterator();
    }
}
