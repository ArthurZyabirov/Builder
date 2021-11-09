import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public Person(String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    //    public Person(String name, String surname) {
//        //...
//    }
//
//    public Person(String name, String surname, int age) {
//        //...
//    }
    public boolean hasAge() { if (age > 0) return true; }
    public boolean hasAddress() { /*...*/ }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() { /*...*/ }

    public String setAddress(String address) { /*...*/ }
    public void happyBirthday() { /*...*/ }

    @Override
    public String toString() { /*...*/ }

    @Override
    public int hashCode() { /*...*/ }
    public PersonBuilder newChildBuilder() { /*...*/ }
}
