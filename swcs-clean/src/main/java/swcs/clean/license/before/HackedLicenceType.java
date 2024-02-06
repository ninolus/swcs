package swcs.clean.license.before;
// Wenn LicenceType final wäre, würde das hier nicht funktionieren.
// Wenn Licences IdentityHashMap nutzt, funktioniert das hier auch nicht.
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
