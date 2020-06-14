package demo;


import _3_Lists.Shipment;
import org.junit.Test;

import static _3_Lists.ProductFixtures.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class ShipmentTest {

    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() throws Exception{
        shipment.add(door);
        shipment.add(window);
        assertThat(shipment, contains(door, window));
    }

}
