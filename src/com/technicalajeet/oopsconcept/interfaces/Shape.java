package com.technicalajeet.oopsconcept.interfaces;

public interface Shape {
    int i = 34;

     void calculateArea(int r);

}

class Circle implements Shape {

    @Override
    public void calculateArea(int r) {
        System.out.println("Area of circle is "+ (Math.PI * Math.pow(r,2)));
    }

    public  static  void  main(String[] args){
        Shape shape = new Circle();
        shape.calculateArea(2);
    }
}


/*
 * notes :- Interface is like a class, but we use interface keyword instead of class keyword
 * variables in interface - if you create any variable in interface it automatically  added
 * public static final
 * ex- public static final int i=34;
 * public methods in interface - If you create any public  method in interface it will automatically became
 * public abstract
 * example - public abstract void calculation();
 *  static and private method in interface - if you create any static and private method in interface it will
 * remain same as of the method created.
 * Interview Question - Abstract Vs Interface???
 * */
