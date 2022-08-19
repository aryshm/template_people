public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("The name cannot be empty");
        } else {
            this.name = name;
            return this;
        }
    }
    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname == null || surname.equals("")) {
        throw new IllegalArgumentException("The last name cannot be empty");
        } else {
            this.surname = surname;
            return this;
        }
    }
    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age >= 0) {
            this.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Unacceptable age");
        }
    }

    public PersonBuilder setAddress(String address) { this.address = address; return this; }

    public Person build() throws IllegalArgumentException {
        Person person;
        if (surname == null || name == null) {
            throw new IllegalArgumentException("Last name or First Name cannot be empty");
        }
        if (age >= 0) {
            person = new Person(name, surname, age);
        } else {
            person = new Person(name, surname);
        }
        person.setAddress(address);
        return person;
    }
}
