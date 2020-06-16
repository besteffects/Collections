package _2_Arrays;

import java.util.Comparator;
import java.util.Objects;

public class Product {
    public static final Comparator<Product> BY_WEIGHT
            // =Comparator.comparing(Product:: getWeight);
            = new Comparator<Product>() {
        public int compare(final Product p1, final Product p2) {
            return Integer.compare(p1.getWeight(), p2.getWeight());
        }
    };

    private final String name;
    private final int weight;


    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Arrays.Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public boolean equals(final Object o) {
        if (!(o instanceof Product)) return false;

        final Product product = (Product) o;

        return Objects.equals(weight, product.weight)
                && Objects.equals(name, product.name);
    }

    public int hashCode() {
        return Objects.hash(name, weight);
    }


}