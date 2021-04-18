package com.company;

public final class Person {
    private final String firstName;
    private final String lastName ;
    private final Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return firstName == person.firstName &&
                lastName == person.lastName &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        int result1 = firstName == null ? 0 : firstName.hashCode();
        int result2 = lastName == null ? 0 : lastName.hashCode();
        int result3 = gender == null ? 0 : gender.hashCode();
        return result1 + result2 + result3;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", gender=" + gender +
                '}';
    }






}
