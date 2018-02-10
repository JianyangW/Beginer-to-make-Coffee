package com.company;


/*
    another sub-class belongs to Employee.
 */
public abstract class Maintance extends Employee{

    public Maintance(String name, int id) {
        super(name, id);

    }
    public abstract void work();
}
