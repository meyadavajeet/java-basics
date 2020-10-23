package com.technicalajeet.conditionalStatement;

import java.util.Scanner;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        System.out.println("NestedIfElseStatement");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstNumber");
        int firstNumber = sc.nextInt();
        System.out.println("Enter secondNumber");
        int secondNumber = sc.nextInt();
        System.out.println("Enter thirdNumber");
        int thirdNumber = sc.nextInt();
        int result = 0;

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber)
                result = firstNumber;
            else
                result = thirdNumber;
        } else {
            if (secondNumber > thirdNumber)
                result = secondNumber;
            else
                result = thirdNumber;
        }

        System.out.println("Largest of three number is " + result);

    }
}
