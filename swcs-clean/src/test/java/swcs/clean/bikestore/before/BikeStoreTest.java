package swcs.clean.bikestore.before;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BikeStoreTest {

    @Test
    void testAddBikeShouldAdd1Bike() {
        BikeStore objectUnderTest = new BikeStore();
        Bike bike = new Bike("Cannondale", BikeType.MTB, 1000);

        assertTrue(objectUnderTest.addBike(bike));
        // schlecht, weil hängt von findBikes ab
        assertEquals(objectUnderTest.findBikes(x -> true).size(), 1);
    }

    @Test
    void testFindBikesShouldFindBikeOfTypeMTB() {
        BikeStore objectUnderTest = new BikeStore();
        objectUnderTest.addBike(new Bike("Bulls", BikeType.MTB, 1000));
        objectUnderTest.addBike(new Bike("Canyon", BikeType.ROAD, 2000));
        objectUnderTest.addBike(new Bike("Specialized", BikeType.ROAD, 3000));
        objectUnderTest.addBike(new Bike("Cube", BikeType.MTB, 4000));
        objectUnderTest.addBike(new Bike("Trek", BikeType.CITY, 1500));

        List<Bike> expected = List.of(new Bike("Bulls", BikeType.MTB, 1000), new Bike("Cube", BikeType.MTB, 4000));
        List<Bike> result = objectUnderTest.findBikes(bike -> bike.type() == BikeType.MTB);

        assertEquals(expected, result);
    }

    @Test
    void testFindBikesShouldFindBikeWithinPrice1000to2000() {
        BikeStore objectUnderTest = new BikeStore();
        float lowerLimit = 1000;
        float upperLimit = 2000;
        objectUnderTest.addBike(new Bike("Bulls", BikeType.MTB, 1000));
        objectUnderTest.addBike(new Bike("Canyon", BikeType.ROAD, 2000));
        objectUnderTest.addBike(new Bike("Specialized", BikeType.ROAD, 3000));
        objectUnderTest.addBike(new Bike("Cube", BikeType.MTB, 4000));
        objectUnderTest.addBike(new Bike("Trek", BikeType.CITY, 1500));

        List<Bike> expected = List.of(new Bike("Bulls", BikeType.MTB, 1000), new Bike("Canyon", BikeType.ROAD, 2000), new Bike("Trek", BikeType.CITY, 1500));
        List<Bike> result = objectUnderTest.findBikes(bike -> bike.price() >= lowerLimit && bike.price() <= upperLimit);

        assertEquals(expected, result);
    }


}