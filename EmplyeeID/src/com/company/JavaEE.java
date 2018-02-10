package com.company;

/*
    define a javaEE class belongs to the Developer class.
 */

public class JavaEE extends Developer{
    public JavaEE(String name, int id) {
        super(name, id);
    }

    public void work() {
        System.out.println( "The employee " + getName() + " with ID: " + getId() + " is working on: Java development." );
    }
}
