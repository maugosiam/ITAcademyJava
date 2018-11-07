public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String street;
    private char gender;


    public User (String firstName, String lastName, int age, String street, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.street = street;
        this.gender = gender;
    }

    public String toString() {
        return (firstName + " " + lastName + " " + age + " " + street + " " + gender);
    }
}
