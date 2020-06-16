package demo;

import _4_Sets.ProductCatalogue;
import org.junit.Test;

import static _3_Lists.ProductFixtures.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;




public class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception {
        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));

    }
}
