package swcs.clean.bikestore.before;

public record Bike(String manufacturer, BikeType type, float price) {

    public boolean isFullSuspension() {
        return this.type == BikeType.MTB;
    }
}
