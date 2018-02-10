package com.company;

/*
    sub-abstract class belongs to Employee.
 */

public abstract class Developer extends Employee {
    public Developer(String name, int id) {
        super(name, id);
    }
    public abstract void work();
}
