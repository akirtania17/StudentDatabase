package com.company;

public class Student extends Person {

    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public void print() {
        System.out.println(getName() + ": " + id);
    }

    public int getId() {
        return id;
    }
}
