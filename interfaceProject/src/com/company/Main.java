package com.company;

public class Main {

    public static void main(String[] args) {

        MyImp Test = new MyImp();
        Test.Function();

        Animal LittleDog = new dog();
        LittleDog.eat();
        Animal Eagle = new bird();
        Eagle.eat();
    }
}
