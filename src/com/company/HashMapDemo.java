package com.company;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Tom", "Cruise", Gender.MALE);
        Person p2 = new Person("Tom", "Hardy", Gender.MALE);
        Person p3 = new Person("Brad", "Pitt", Gender.MALE);
        Person p4 = new Person("Bradley", "Cooper", Gender.MALE);
        Person p5 = new Person("Angelina ", "Jolie", Gender.FEMALE);

        // Create ArrayList
        Map<Person, Integer> Persons = new HashMap<>();
        Persons.put(p1, 1);
        Persons.put(p2, 2);
        Persons.put(p3, 3);
        Persons.put(p4, 4);
        Persons.put(p5, 5);

        outputCollection(Persons);
    }

    public static void outputCollection(Map<Person, Integer> map) {
        System.out.println("Вывод: ");

        for (Map.Entry<Person, Integer> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
        }

        System.out.println("Общее количество элементов - "+ map.size());
    }
}
