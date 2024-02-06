package swcs.clean.license.before;

public class Client {

    public static void main(String[] args) {
        Licences licences = new Licences();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String ddd = licences.get(new HackedLicenceType("ddd"));

            if (ddd != null) {
                System.out.println(ddd);
            }
        }
    }
}
