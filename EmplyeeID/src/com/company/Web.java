package com.company;

/*
    define a sub-class belongs to Maintenance class.
 */

public class Web extends Maintance {
    public Web(String name, int id) {
        super(name, id);
    }
    public void work() {
        System.out.println( "The employee " + getName() + " with ID: " + getId() + " is working on: web maintenance." );
    }
}
