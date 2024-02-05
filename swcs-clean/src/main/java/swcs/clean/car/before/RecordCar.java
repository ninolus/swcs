package swcs.clean.car.before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

record RecordCar(String number, LocalDate manufactured, List<String> previousOwners) {

    public RecordCar {
        previousOwners = List.copyOf(previousOwners);
    }

    public ImmutableCar addPreviousOwner(String text) {
        text = text.trim();
        List<String> newPreviousOwners = new ArrayList<>(this.previousOwners);
        newPreviousOwners.add(text);
        // todo: Hier die gleiche Frage wie in ImmutableCar: Ist hier das List.copyOf notwendig?
        return new ImmutableCar(this.number, this.manufactured, List.copyOf(newPreviousOwners));
    }
}