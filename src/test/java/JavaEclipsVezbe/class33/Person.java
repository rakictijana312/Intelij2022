package class33;

public class Person {
    String firstName;
    String lastname;
    String gender;

    public Person(String firstName,
                  String lastname, String gender) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
