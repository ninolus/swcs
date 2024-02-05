package swcs.clean.license.before;

import java.util.HashMap;
import java.util.Map;

// todo: Ist es sinnvoll, sowas immutable zu machen?
record ImmutableLicenses(Map<LicenceType, String> licences) {
    public ImmutableLicenses {
        licences = new HashMap<>(licences);
        licences.putIfAbsent(new LicenceType("demo-licence"), "XARD-LOKU-CJKF-CLLF-OPLJJ");
        licences = Map.copyOf(licences);
    }

    public String get(LicenceType licence) {
        return this.licences.get(licence);
    }

    public ImmutableLicenses put(LicenceType licence, String value) {
        Map<LicenceType, String> newLicences = new HashMap<>(this.licences);
        newLicences.put(licence, value);
        return new ImmutableLicenses(newLicences);
    }
}
