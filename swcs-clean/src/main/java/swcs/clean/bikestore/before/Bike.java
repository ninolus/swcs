package swcs.clean.bikestore.before;

record Bike(String manufacturer, BikeType type, float price) {

    // noch besser: Das hier löschen und die Infos direkt aus dem BikeType holen!
    public boolean isFullSuspension() {
        return this.type.isFullSuspension();
    }
}
