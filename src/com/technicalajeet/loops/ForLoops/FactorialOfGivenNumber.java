package com.technicalajeet.loops.ForLoops;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int n = sc.nextInt();
        int fact =1;
        if (n < 0) {
            System.out.println("Error! Factorial of a negative number doesn't exist.");
        } else {
            for (int i =n ; i >= 1; i--) {
                fact = fact* i;
            }

            System.out.println(fact);
        }

    }
}
