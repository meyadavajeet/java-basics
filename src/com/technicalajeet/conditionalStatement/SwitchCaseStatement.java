package com.technicalajeet.conditionalStatement;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 7");
        int dayOfWeek = sc.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("It is sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7: case 8:
                System.out.println("Saturday or Weekend");
                break;
            default:
                System.out.println("Unknown Value");
        }


    }
}
