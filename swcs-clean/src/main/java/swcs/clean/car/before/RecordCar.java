package swcs.clean.car.before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

record RecordCar(String vin, LocalDate manufactured, List<String> previousOwners) {

    public RecordCar {
        previousOwners = List.copyOf(previousOwners);
    }

    // Das wäre nicht die optimale Lösung
    public static ImmutableCar of(RecordCar car, String newOwner) {
        List<String> newPreviousOwners = new ArrayList<>(car.previousOwners());
        newPreviousOwners.add(newOwner.trim());
        // todo: Hier die gleiche Frage wie in ImmutableCar: Ist hier das List.copyOf notwendig?
        return new ImmutableCar(car.vin(), car.manufactured(), List.copyOf(newPreviousOwners));
    }

    // besser:
    // alternative wäre, das nicht static zu machen und die Parameter direkt aus dem alten car zu nehmen
    public static RecordCar of(RecordCar car, List<String> previousOwners) {
        return new RecordCar(car.vin(), car.manufactured(), previousOwners);
    }
}