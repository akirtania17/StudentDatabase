package com.company;

public class Undergraduate extends Student {

    String grade;

    public Undergraduate(String name, int id, String grade) {
        super(name, id);
        this.grade = grade;
    }

    @Override
    public void print() {
        System.out.println(getName() + ": " + getId() + ", " + grade);
    }

    public boolean equals(Undergraduate u) {
        if (u.grade.equals(grade)) {
            return true;
        }
        return false;
    }

    public String getGrade() {
        return grade;
    }
}
