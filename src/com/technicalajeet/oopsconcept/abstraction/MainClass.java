package com.technicalajeet.oopsconcept.abstraction;

public class MainClass {
    public  static  void  main(String [] args){
//        MyClass myClass = new MyChildClass();
        MyChildClass myClass = new MyChildClass();
        myClass.cal();
        myClass.launchRocket();
    }
}

//Here MyClass is the Abstract class we can not create object of that class,
// so we created object of MyChildClass and call the abstract class method whose implementation
// in the child class.
