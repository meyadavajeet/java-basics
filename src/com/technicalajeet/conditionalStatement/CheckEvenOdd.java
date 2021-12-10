package com.technicalajeet.conditionalStatement;

import java.util.Scanner;

//check the given number is even or odd
public class CheckEvenOdd {
    public static void main(String args[]) {
        System.out.print("please enter any number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is a even number");
        } else
            System.out.println(number + "not an even number");
    }
}
