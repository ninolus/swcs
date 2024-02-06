package swcs.clean.bikestore.before;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

final class BikeStore {

   private final List<Bike> bikes;

    public BikeStore() {
        this.bikes = new ArrayList<>();
    }

    public boolean addBike(Bike bike) {
        return this.bikes.add(bike);
    }

    // Filter 1: bike -> bike.type() == type
    // Filter 2:  bike -> bike.price() >= lowerLimit && bike.price() <= upperLimit
    // Filter 3: bike -> bike.type() == type && bike.price() >= lowerLimit && bike.price() <= upperLimit
    public List<Bike> findBikes(Predicate<Bike> filter) {
        return this.bikes.stream().filter(filter).toList();
    }
}
