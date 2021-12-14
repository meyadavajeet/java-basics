package com.technicalajeet.oopsconcept.abstraction;

abstract public class MyClass {

    public void cal() {
        System.out.println("calculation");
    }

    //abstract method
    abstract public void launchRocket();
}

//if one or more  method is abstract in a class then this class is known as abstract class
// note - abstract method can not be instantiated that means we can't create the object of abstract class
