package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //declare variables
        int numOfPeople;
        String type;
        String name;
        int id;
        String grade;
        String major;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nNumber of People: ");
        numOfPeople = sc.nextInt();

        while (numOfPeople < 1 || numOfPeople > 10) {
            System.out.print("Enter Again from 1-10: ");
            numOfPeople = sc.nextInt();
        }

        Person[] people = new Person[numOfPeople];

        sc.nextLine();
        for (int i = 0; i < numOfPeople; i++) {
            System.out.print("\nType of Human: ");
            type = sc.nextLine();

            if (type.equals("person") || type.equals("Person")) {
                System.out.print("Enter Name: ");
                name = sc.nextLine();

                Person p = new Person(name);
                people[i] = p;
            }

            else if (type.equals("student") || type.equals("Student")) {
                System.out.print("Enter Name: ");
                name = sc.nextLine();
                System.out.print("Enter ID: ");
                id = sc.nextInt();

                Student s = new Student(name, id);
                people[i] = s;
                sc.nextLine();
            }

            else if (type.equals("undergraduate") || type.equals("Undergraduate")) {
                System.out.print("Enter Name: ");
                name = sc.nextLine();
                System.out.print("Enter ID: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Grade: ");
                grade = sc.nextLine();

                Undergraduate u = new Undergraduate(name, id, grade);
                people[i] = u;
            }

            else if (type.equals("graduate") || type.equals("Graduate")) {
                System.out.print("Enter Name: ");
                name = sc.nextLine();
                System.out.print("Enter ID: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Major: ");
                major = sc.nextLine();

                Graduate g = new Graduate(name, id, major);
                people[i] = g;
            }
        }

        PeopleArray ppl = new PeopleArray(people);

        System.out.println("\n~ User Interface ~");
        System.out.println("0. Stop Program");
        System.out.println("1. Print All Persons");
        System.out.println("2. Print All Students");
        System.out.println("3. Print All Undergraduates");
        System.out.println("4. Print All Graduates");
        System.out.println("5. Print Equal Undergraduates");
        System.out.println("6. Print Equal Graduates");
        System.out.println("7. Find Person");

        int function = 1;
        while(function != 0) {
            System.out.print("\nChoose a Function: ");
            function = sc.nextInt();

            if (function == 1) {
                ppl.printPersons();
            }
            else if (function == 2) {
                ppl.printStudents();
            }
            else if (function == 3) {
                ppl.printUndergraduates();
            }
            else if (function == 4) {
                ppl.printGraduates();
            }
            else if (function == 5) {
                System.out.print("Enter Student ID: ");
                int x = sc.nextInt();
                ppl.findEqualGrade(x);

            }
            else if (function == 6) {
                System.out.print("Enter Student ID: ");
                int x = sc.nextInt();
                ppl.findEqualMajor(x);
            }
            else if (function == 7) {
                sc.nextLine();
                System.out.print("Enter Name: ");
                String n = sc.nextLine();
                ppl.findPerson(n);
            }
            else {
                System.out.println("Invalid Function");
            }
        }
    }
}
