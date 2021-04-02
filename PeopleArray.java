package com.company;

import java.util.ArrayList;

public class PeopleArray {

    Person[] people;

    public PeopleArray(Person[] people) {
        this.people = people;
    }

    public void  printPersons() {
        for (Person p : people) {
            p.print();
        }
    }

    public void printStudents() {
        for (Person p : people) {
            if (p instanceof Student) {
                Student s = (Student)p;
                s.print();
            }
        }
    }

    public void printUndergraduates() {
        for (Person p : people) {
            if (p instanceof Undergraduate) {
                Undergraduate u = (Undergraduate) p;
                u.print();
            }
        }
    }

    public void printGraduates() {
        for (Person p : people) {
            if (p instanceof Graduate) {
                Graduate g = (Graduate) p;
                g.print();
            }
        }
    }

    public void findEqualGrade(int id) {

        ArrayList<Undergraduate> undergrads = new ArrayList<Undergraduate>();

        for (Person p : people) {
            if (p instanceof Undergraduate) {
                Undergraduate u = (Undergraduate)p;

                if (u.getId() == id) {
                    for (Person x : people) {

                        if (x instanceof Undergraduate) {
                            Undergraduate y = (Undergraduate)x;
                            if (y.getId() != id) {
                                if (y.equals(u)) {
                                    undergrads.add(y);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (Undergraduate u : undergrads) {
            u.print();
        }
    }

    public void findEqualMajor(int id) {

        ArrayList<Graduate> grads = new ArrayList<Graduate>();

        for (Person p : people) {
            if (p instanceof Graduate) {
                Graduate g = (Graduate)p;

                if (g.getId() == id) {
                    for (Person x : people) {

                        if (x instanceof Graduate) {
                            Graduate y = (Graduate)x;
                            if (y.getId() != id) {
                                if (y.equals(g)) {
                                    grads.add(y);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (Graduate g : grads) {
            g.print();
        }
    }

    public void findPerson(String name) {
        for (Person p : people) {
            if (p.getName().equals(name)) {
                p.print();
            }
        }
    }
}
