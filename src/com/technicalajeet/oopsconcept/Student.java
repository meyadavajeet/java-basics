package com.technicalajeet.oopsconcept;

public class Student {
    //data members and instance variable
    int studentId;
    String studentName;
    String studentCity;

    //    creating constructor non parameterized constructor
    Student() {
        System.out.println("it is automatically Called on object is created");
    }

    //creating constructor parameterized constructor with one parameter
    Student(int x) {
        System.out.println("Parameterized constructor called");
    }

    //creating parameterized constructor with multiple parameter
    Student(int x, String y, String z) {
        studentId = x;
        studentName = y;
        studentCity = z;
    }

    //Behaviour : members methods or members functions
    public void study() {
        System.out.println(studentName + " is studying");
    }

    public void fullDetails() {
        System.out.println("my name is " + studentName);
        System.out.println("my city is " + studentCity);
        System.out.println("my id is " + studentId);
    }


}
