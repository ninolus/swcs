package swcs.gof.creational.prototype.copy.person;

public class Client {

    public static void main(String[] args) {

        Person orginal = new Person("Orginal name", new Address("Orginal city", "Orginal street"));
        print("Orginal", orginal);

        // Clone as a deep copy with copy constructor
        Person clone = new Person(orginal);
        // Alternative as a deep copy with copy factory
        // Person clone = Person.newInstance(orginal);
        print("Clone", clone);

        clone.setName("Modified name");
        clone.getAddress().setCity("Modified city");

        print("Clone after modification", clone);
        print("Orginal after clone modification", orginal);
    }

    private static void print(String object, Person person) {
        System.out.println(String.format("%s: %s, %s",
                object,
                person.getName(),
                person.getAddress().getCity()));
    }
}
