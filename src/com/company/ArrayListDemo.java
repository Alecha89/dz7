package com.company;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Tom", "Cruise", Gender.MALE);
        Person p2 = new Person("Tom", "Hardy", Gender.MALE);
        Person p3 = new Person("Brad", "Pitt", Gender.MALE);
        Person p4 = new Person("Bradley", "Cooper", Gender.MALE);
        Person p5 = new Person("Angelina ", "Jolie", Gender.FEMALE);

        // Create ArrayList
        ArrayList<Person> Persons = new ArrayList<>();
        Persons.add(p1);
        Persons.add(p2);
        Persons.add(p3);
        Persons.add(p4);
        Persons.add(p5);

       outputCollection(Persons);
    }

    public static void outputCollection(ArrayList<Person> list) {
        System.out.println("Вывод: ");

        for (Person number : list) {
            System.out.println(number);
        }
        System.out.println("Общее количество элементов - "+ list.size());
    }
}
