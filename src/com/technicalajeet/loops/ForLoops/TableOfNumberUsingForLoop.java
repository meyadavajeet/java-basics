package com.technicalajeet.loops.ForLoops;

import java.util.Scanner;

public class TableOfNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table;
        System.out.println("Please enter a number which you want to print");
        int tableOfNumber = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            table = i * tableOfNumber;
            System.out.println(tableOfNumber + " * " + i + " = " + table);
        }
    }
}
