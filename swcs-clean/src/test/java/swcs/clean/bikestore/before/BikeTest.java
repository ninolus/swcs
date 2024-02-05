package swcs.clean.bikestore.before;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    void testIsFullSuspensionReturnsTrue() {
        Bike objectUnderTest = new Bike("Cannondale", BikeType.MTB, 1000);
        assertTrue(objectUnderTest.isFullSuspension());
    }
}