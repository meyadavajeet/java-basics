package com.technicalajeet.conditionalStatement;

import java.util.Scanner;

//check greatest number among 2 numbers
public class GreatestNumberAmong2Numbers {
    public static void main(String[] args) {
        System.out.print("Please enter your first number: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.print("Please enter your second number: ");
        int n2 = scanner.nextInt();
        if (n1 == n2) {
            System.out.println("Both numbers are equal");
        } else if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else {
            System.out.println(n2 + " is greater than " + n1);
        }
        scanner.close();

    }
}
