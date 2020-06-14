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
        shipment.replace(door, floorPanel);

        assertThat(shipment, contains(door, window));
    }

    @Test
    public void shouldReplaceItems ()throws Exception {
        shipment.add(door);
        shipment.add(window);
        shipment.replace(door,floorPanel);

        assertThat(shipment,contains(floorPanel,window));
    }
}
