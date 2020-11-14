package com.technicalajeet.loops.ForLoops;

import java.util.Scanner;

public class PowerWithoutUsingBuiltinMethod {
    public static void main(String[] args) {
        //print power of number without using the built in method of java
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number a ");
        int a = sc.nextInt();
        System.out.println("Please enter number b ");
        int b = sc.nextInt();
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        System.out.println(result);
    }
}
