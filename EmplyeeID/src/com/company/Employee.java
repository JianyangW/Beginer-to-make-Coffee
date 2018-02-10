package com.company;


/*
    employee abstract function:
        1. name, id number, and what are they doing now.
        2. constructor.
        3. abstract for working function.
 */
public abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.id = id;
        this.name = name;

    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
