package swcs.clean.license.before;

import java.util.IdentityHashMap;
import java.util.Map;

public final class Licences {
    private final Map<LicenceType, String> licences;

    public Licences() {
        // IdentityHashMap nutzt nicht equals, sondern nutzt Referenzgleichheit
        this.licences = new IdentityHashMap<>();
        this.licences.put(new LicenceType("demo-licence"), "XARD-LOKU-CJKF-CLLF-OPLJJ");
    }

    public String get(LicenceType licence) {
        return this.licences.get(licence);
    }

    public void put(LicenceType licence, String value) {
        this.licences.put(licence, value);
    }
}
