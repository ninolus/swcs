package swcs.clean.car.before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Alternative solution with record: see RecordCar.java
class ImmutableCar {

    private final String vin;
    private final LocalDate manufactured;
    private final List<String> previousOwners;

    public ImmutableCar(String number, LocalDate manufactured, List<String> previousOwners) {
        this.vin = number;
        this.manufactured = manufactured;
        this.previousOwners = List.copyOf(previousOwners);
    }

    public LocalDate manufactured() {
        return this.manufactured;
    }

    public String vin() {
        return this.vin;
    }

    public List<String> previousOwners() {
        return List.copyOf(this.previousOwners);
    }

    public ImmutableCar addPreviousOwner(String text) {
        text = text.trim();
        List<String> newPreviousOwners = new ArrayList<>(this.previousOwners);
        newPreviousOwners.add(text);
        // todo: Ist hier das List.copyOf notwendig?
        return new ImmutableCar(this.vin, this.manufactured, List.copyOf(newPreviousOwners));
    }
}
