package task1;

public class Person {
    private String name;
    private String surname;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString () {
        return this.name + " " + this.surname;
    }

    public void changePerson () {
        name = "Ilya";
        surname = "Lagutenko";
    }

    public void changePerson1 (Person person) {
        this.name = "Ilya";
        this.surname = "Lagutenko";
    }
}
