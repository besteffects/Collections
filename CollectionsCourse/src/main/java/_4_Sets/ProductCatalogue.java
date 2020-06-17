package _4_Sets;

import _2_Arrays.Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductCatalogue implements Iterable<Product> {

    private Set<Product> products = new HashSet<>();

    private final Set<Product> treeSetProducts = new TreeSet<>(Product.BY_NAME); //Comparing products by name


    public void isSuppliedBy(Supplier supplier) {
        products.addAll(supplier.products());
    }

    public Iterator<Product> iterator() {
        return products.iterator();
    }


}
