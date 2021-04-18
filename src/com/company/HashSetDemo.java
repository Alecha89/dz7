package com.company;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Tom", "Cruise", Gender.MALE);
        Person p2 = new Person("Tom", "Cruise", Gender.MALE);
        Person p3 = new Person("Brad", "Pitt", Gender.MALE);
        Person p4 = new Person("Brad", "Pitt", Gender.MALE);
        Person p5 = new Person("Angelina ", "Jolie", Gender.FEMALE);

        // Create Set
        Set<Person> Persons = new HashSet<>();
        Persons.add(p1);
        Persons.add(p2);
        Persons.add(p3);
        Persons.add(p4);
        Persons.add(p5);

        outputCollection(Persons);
    }

    public static void outputCollection(Set<Person> set) {
        System.out.println("Вывод: ");

        for (Person number : set) {
            System.out.println(number + " ");
        }

        System.out.println("Общее количество элементов - "+ set.size());
    }
}
