package _4_Sets;

import _2_Arrays.Product;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static _2_Arrays.Product.BY_NAME;
import static _2_Arrays.Product.BY_WEIGHT;

public class SortedSetCatalogue implements Iterable<Product> {
    private final SortedSet<Product> products = new TreeSet<>(BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.products());
    }

    public Iterator<Product> iterator() {
        return products.iterator();
    }

    public Set<Product> lightVanProducts(){
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.headSet(heaviestLightVanProduct);
    }

    public Set <Product> heavyVanProducts(){
        Product heaviestLightVanProduct = findHeaviestLightVanProduct();
        return products.tailSet(heaviestLightVanProduct);
    }

    private Product findHeaviestLightVanProduct() {
        for(Product product: products){
            if (product.getWeight()>20){
              return product;
            }
        }
        return products.last();
    }
}
