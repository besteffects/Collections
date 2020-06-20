package _6_Maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LookupTableComparison {
    private static final int ITERATIONS = 5;
    private static final int NUMBER_OF_PRODUCTS = 20_000;

    private static final List<ProductMap> products = generateProducts();

    public static void main(String[] args) {
        runLookups(new MapProductLookupTable());
        runLookups(new NaiveProductLookupTable());
    }

    private static List<ProductMap> generateProducts() {
        final List<ProductMap> products = new ArrayList<>();
        final Random weightGenerator = new Random();
        for (int i = 0; i < NUMBER_OF_PRODUCTS; i++) {
            products.add(new ProductMap(i, "Product" + i, 10 + weightGenerator.nextInt(10)));
        }
        Collections.shuffle(products);
        Collections.shuffle(products);
        Collections.shuffle(products);
        return products;
    }

    private static void runLookups(final ProductLookupTable lookupTable) {
        final List<ProductMap> products = LookupTableComparison.products;
        System.out.println("Running lookups with " + lookupTable.getClass().getSimpleName());
        for (int i = 0; i < ITERATIONS; i++) {
            final long startTime = System.currentTimeMillis();
            for (ProductMap productMap : products) {
                lookupTable.addProduct(productMap);
            }

            for (ProductMap productMap : products) {
                final ProductMap result = lookupTable.lookupById(productMap.getId());
                if (result != productMap) {
                    throw new IllegalStateException("Lookup table returned wrong result for " + productMap);
                }
            }
            lookupTable.clear();
            System.out.println(System.currentTimeMillis() - startTime + "ms");
        }

    }
}
