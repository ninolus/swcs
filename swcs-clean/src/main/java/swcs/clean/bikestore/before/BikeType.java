package swcs.clean.bikestore.before;

// Die Zahlen von Hand zuzuordnen ist eigentlich unnötig, aber damit man es mal gesehen hat:
// Sinnvoll wäre das, z.B. wenn man die Daten aus einer Datenbank holt
enum BikeType {
    MTB(0, true),
    ROAD(1, false),
    CITY(2, false);

    private final int type;
    private final boolean isFullSuspension;

    BikeType(int type, boolean isFullSuspension) {
        this.type = type;
        this.isFullSuspension = isFullSuspension;
    }

    public int type() {
        return type;
    }

    public boolean isFullSuspension() {
        return isFullSuspension;
    }
}
