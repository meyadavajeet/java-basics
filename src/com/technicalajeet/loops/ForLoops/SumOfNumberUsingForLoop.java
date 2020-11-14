package com.technicalajeet.loops.ForLoops;

import java.util.Scanner;

public class SumOfNumberUsingForLoop {
    public static void main(String[] args) {
        //wap a program to get input from user and print sum of 1 to user input the number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int finalNumber = sc.nextInt();

        int sum = 0;
        for (int initialNumber = 1; initialNumber <= finalNumber; initialNumber++) {
            sum = sum + initialNumber;
        }
        System.out.println("sum of number from 1 to " + finalNumber + " is " + sum);
    }
}
