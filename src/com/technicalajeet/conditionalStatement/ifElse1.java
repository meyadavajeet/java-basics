package com.technicalajeet.conditionalStatement;

import java.util.Scanner;

//if age greater than 18 adult else not an adult
public class ifElse1 {
    public static void main(String[] args) {
        System.out.print("Please enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not and Adult");
        }
    }
}
