package com.company;


/*
    the function for this code is that random pick a name from the name list.
    process;
    1. create a name list.
    2. read all names from the list.
    3. using random function to pick a name from the list.

 */

import java.util.ArrayList;
import java.util.Random;

public class Main {
    /*
    1. create a name list.
     */
    public static void main(String[] args) {
        ArrayList<Person> array = new ArrayList<>();

        addPerson(array);
        ReadPerson(array);
        RandomPerson(array);
    }

    public static void addPerson(ArrayList<Person> array) {
        Person p1 = new Person();
        p1.setName("Jame");
        p1.setAge(25);

        Person p2 = new Person();
        p2.setName("Jay");
        p2.setAge(26);

        Person p3 = new Person();
        p3.setName("Frank");
        p3.setAge(23);

        Person p4 = new Person();
        p4.setName("Aaron");
        p4.setAge(27);

        Person p5 = new Person();
        p5.setName("Bran");
        p5.setAge(24);

        array.add(p1);
        array.add(p2);
        array.add(p3);
        array.add(p4);
        array.add(p5);
    }
    /*
    2. read all names from the list.
     */
    public static void ReadPerson(ArrayList<Person> array) {
        for(int i = 0; i < array.size(); i++) {
            Person r = array.get(i);
            System.out.println("this is " + r.getName() + " he is " + r.getAge() + "years old.");
        }
    }
    /*
    3. using random function to pick a name from the list.
     */
    public static void RandomPerson(ArrayList<Person> array) {
        Random p = new Random();
        int j = p.nextInt(array.size());
        Person N = array.get(j);
        System.out.println("The one picked is:  " + N.getName() + " he is " + N.getAge() + "years old.");

    }
}
