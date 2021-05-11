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
        Map<Integer, Person> Persons = new HashMap<Integer, Person>();
        //Map<Person, Integer> Persons = new HashMap<Integer, Person>();
        Persons.put(1, p1);
        Persons.put(2, p2);
        Persons.put(3, p3);
        Persons.put(4, p4);
        Persons.put(5, p5);
        outputCollection(Persons);
    }

    public static void outputCollection(Map<Integer, Person> map) {
        System.out.println("Вывод: ");

        for (Map.Entry<Integer, Person> keyValuePair : map.entrySet()) {
            System.out.println(keyValuePair.getKey() + " - " + keyValuePair.getValue());
        }
        System.out.println("Общее количество элементов - "+ map.size());
    }


}
