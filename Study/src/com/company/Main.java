package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Word!");

        int Area = GetArea(5,6);

        String Name = YourName("Building A" );
        System.out.println(Name + " Area is " + Area);

        Type T = new Type();
        T.age = 20.0;
        T.gender = "Male";
        T.name = "Jack";

        System.out.println(T.name +" is " + T.gender + " and he is " +T.age + " Years old.");

        NameArray();

    }

    public static int GetArea( int w, int h) {

        return w * h;
    }

    public static String YourName(String a) {
        return a;

    }
    public static void NameArray() {
        ArrayList<String> array= new ArrayList<>();
        array.add("Jerremy");
        array.add("Jerremy1");
        array.add("Jerremy2");
        array.add("Jerremy3");
        array.add("Jerremy4");

        for (int i = 0; i < array.size(); i++){

            Scanner StudentName = new Scanner(System.in);
            int j = i;
            j = StudentName.nextInt();
            System.out.println(array.get(j));
        }
    }
}
