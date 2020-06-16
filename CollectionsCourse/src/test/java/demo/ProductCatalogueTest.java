package demo;

import _4_Sets.ProductCatalogue;
import org.hamcrest.MatcherAssert;
import org.junit.Test;


import static _3_Lists.ProductFixtures.*;
import static org.hamcrest.Matchers.containsInAnyOrder;



public class ProductCatalogueTest {

    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception {
        ProductCatalogue catalogue = new ProductCatalogue();
        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

       MatcherAssert.assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));

    }
}
