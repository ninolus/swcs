package swcs.clean.license.before;

public class HackedLicenceType extends LicenceType {
    private static int i;

    public HackedLicenceType(String type) {
        super(type);
    }

    @Override
    public int hashCode() {
        return i++;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }
}
