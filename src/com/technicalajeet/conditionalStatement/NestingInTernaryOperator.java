package com.technicalajeet.conditionalStatement;

import java.util.Scanner;

public class NestingInTernaryOperator {
    public static void main(String[] args) {
        //find largest number of three number using ternary operator
        System.out.println("NestedIfElseStatement");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstNumber");
        int firstNumber = sc.nextInt();
        System.out.println("Enter secondNumber");
        int secondNumber = sc.nextInt();
        System.out.println("Enter thirdNumber");
        int thirdNumber = sc.nextInt();
        int result = 0;
        result = firstNumber > secondNumber ? firstNumber > thirdNumber ? firstNumber : thirdNumber : secondNumber > thirdNumber ? secondNumber : thirdNumber;

        System.out.println("largest of three number is " +result);
    }
}
