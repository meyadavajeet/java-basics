package com.technicalajeet.conditionalStatement;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double firstNumber = sc.nextFloat();
        System.out.println("Enter Second Number");
        double secondNumber = sc.nextFloat();
        double result = 0;
        System.out.println("Please choose operation symbol among one of these +  - * / %");
        sc.nextLine();
        char operation = sc.nextLine().charAt(0); //finding first position of string using charAt method of string
        switch (operation){
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("Invalid input");
        }

        System.out.println("Result = " + result);


    }
}
