package com.technicalajeet.oopsconcept;

public class MainClass {
    public static void main(String[] args) {
//        now creating object of student

//        now creating object of student
        Student student;

        student = new Student();
        student.studentId = 1;
        student.studentName = "Ajeet Yadav";
        student.studentCity = "Hazaribag";

        student.study();
        System.out.println();
        student.fullDetails();




//        creating another object for the Student class
        Student student1 = new Student();
        student1.studentId = 2;
        student1.studentName="Rahul Guru ji";
        student1.studentCity = "Haryana";

        student1.study();
        System.out.println();
        student1.fullDetails();

        //calling parametrized constructor
        Student student2 = new Student(23);

        //calling multi-parameterized constructor
        Student student3 = new Student(1,"A.R Rahman","Ranchi");

        // creating object of dog class
        Dog dog = new Dog();
        dog.sleep();
        dog.eat(); //this method comes from the inherited Animal Parent class
        System.out.println(dog.color);

    }
}
