package swcs.clean.bikestore.before;

record Bike(String manufacturer, BikeType type, float price) {

    public boolean isFullSuspension() {
        return this.type == BikeType.MTB;
    }
}
