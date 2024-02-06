package swcs.clean.car.before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Alternative solution with record: see RecordCar.java
final class ImmutableCar {

    private final String vin;
    private final LocalDate manufactured;
    private final List<String> previousOwners;

    public ImmutableCar(String vin, LocalDate manufactured, List<String> previousOwners) {
        this.vin = vin;
        this.manufactured = manufactured;
        this.previousOwners = List.copyOf(previousOwners);
    }

    public String vin() {
        return this.vin;
    }

    public LocalDate manufactured() {
        return this.manufactured;
    }

    public List<String> previousOwners() {
        return this.previousOwners;
    }

    public ImmutableCar addPreviousOwner(String text) {
        List<String> newPreviousOwners = new ArrayList<>(this.previousOwners);
        newPreviousOwners.add(text.trim());
        // todo: Ist hier das List.copyOf notwendig? Ja, denn Zurückgebene Liste soll auch immutable sein!
        return new ImmutableCar(this.vin, this.manufactured, List.copyOf(newPreviousOwners));
    }
}
