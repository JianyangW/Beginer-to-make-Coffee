package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/*

market system.

1. initial data.
2. manue choice.
3. functions:
    1. create goods.
    2. reset goods.
    3. delete goods.
    4. read goods.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<GoodsName> array = new ArrayList<>();
        initialValue(array);
        MainManue();
        while(true){
            int number = SelectFunction();
            switch(number){
                case 1:
                    // give read manue function.
                    ShowManue(array);
                    break;
                case 2:
                    //give create a new goods function.
                    AddManue(array);
                    break;
                case 3:
                    //give delete goods function.
                    DeleteManue(array);
                    break;
                case 4:
                    //give reset goods function.
                    UpdateManue(array);
                    break;
                default:
                    System.out.println("please give a correct number!");
            }
        }

    }

    public static void MainManue() {
        System.out.println("````````Welcome to Market!`````````");
        System.out.println("____________________________________");
        System.out.println("1. Read Item list.  2. create a new item.");
        System.out.println("____________________________________");
        System.out.println("3. delete goods.    4. upgrade a item.");
    }

    public static void ShowManue(ArrayList<GoodsName> array) {
        System.out.println();
        System.out.println("This is the Manue.");
        System.out.println("ID        Name        price/unit ");
        for(int i = 0; i < array.size(); i++){
            GoodsName Name = array.get(i);
            System.out.println(Name.ID+"         "+Name.name+"          "+Name.price);
        }
        System.out.println("_________________________");
        System.out.println("Choose next function: ");
        MainManue();


    }

    public static void DeleteManue(ArrayList<GoodsName> array) {
        System.out.println("Please type a item ID to delete:");
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();
        for (int i = 0; i < array.size(); i++) {
            GoodsName Item = array.get(i);
            if (Item.ID == ID) {
                array.remove(i);
                System.out.println("Item Delete Successful, and this is your new list:");
                ShowManue(array);
                System.out.println("_________________________");
                return;
            }

        }
        System.out.println("Did't find Item ID.");
        System.out.println("_________________________");
        System.out.println("Choose next function: ");
        MainManue();
    }
    public static void UpdateManue(ArrayList<GoodsName> array) {
        System.out.println("Please type a item ID to update:");
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();
        for (int i = 0; i < array.size(); i++) {
            GoodsName Item = array.get(i);
            if (Item.ID == ID) {
                System.out.println("please a new Item ID:");
                Item.ID = sc.nextInt();
                System.out.println("please a new Item Name:");
                Item.name = sc.next();
                System.out.println("please a new Item Price:");
                Item.price = sc.nextDouble();
                System.out.println("Item Updated Successfully and this is your new list:");
                ShowManue(array);
                System.out.println("_________________________");
                return;

            }

        }
        System.out.println("Did't find Item ID.");
        System.out.println("_________________________");
        System.out.println("Choose next function: ");
        MainManue();
    }

    public static void AddManue(ArrayList<GoodsName> array) {
        System.out.println("Please add a new goods.");
        Scanner ad = new Scanner(System.in);
        System.out.println("give a ID number:");
        int ID = ad.nextInt();
        System.out.println("give a name of this goods:");
        String name = ad.next();
        System.out.println("give the unite price of this goods:");
        double price = ad.nextDouble();
        GoodsName g4 = new GoodsName();
        g4.ID = ID;
        g4.price = price;
        g4.name = name;
        array.add(g4);
        System.out.println("Item Add Successfully and this is your new list:");
        ShowManue(array);
        System.out.println("_________________________");

    }

    public static int SelectFunction(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

    public static void initialValue(ArrayList<GoodsName> array) {
        GoodsName g1 = new GoodsName();
        g1.ID = 0001;
        g1.name = "Apple";
        g1.price = 2.0;

        GoodsName g2 = new GoodsName();
        g2.ID = 0002;
        g2.name = "Pizza";
        g2.price = 10.0;

        GoodsName g3 = new GoodsName();
        g3.ID = 0003;
        g3.name = "pen";
        g3.price = 5.0;

        array.add(g1);
        array.add(g2);
        array.add(g3);

    }
}
