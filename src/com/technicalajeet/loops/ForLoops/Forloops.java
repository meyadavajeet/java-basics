package com.technicalajeet.loops.ForLoops;

public class Forloops {
    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++)
//            System.out.println("Hello World " + i);

        System.out.println("Odd Numbers");
        //print odd number less than 100
        for (int i = 1; i <= 100; i = i + 2)
            System.out.println(i);

        System.out.println("Even numbers");
        //print event number less than 100
        for (int i = 2; i < 100; i = i + 2)
            System.out.println(i);
    }
}
