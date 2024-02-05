package swcs.clean.license.before;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableLicensesTest {

    @Test
    void testDemoLicense() {
        ImmutableLicenses licences = new ImmutableLicenses(new HashMap<>());
        assertEquals("XARD-LOKU-CJKF-CLLF-OPLJJ", licences.get(new LicenceType("demo-licence")));
        assertEquals(licences.licences().size(), 1);
    }

    @Test
    void testPutShouldAddOneItemPerPut() {
        ImmutableLicenses licences = new ImmutableLicenses(new HashMap<>());
        licences = licences.put(new LicenceType("test-licence"), "YEET-KAKI-KIWI-CCCC-OPEL");
        licences = licences.put(new LicenceType("other-licence"), "FEET-BAKE-KIWI-CCCC-QACK");
        assertEquals("YEET-KAKI-KIWI-CCCC-OPEL", licences.get(new LicenceType("test-licence")));
        assertEquals("XARD-LOKU-CJKF-CLLF-OPLJJ", licences.get(new LicenceType("demo-licence")));
        assertEquals(licences.licences().size(), 3);
    }

}