package com.technicalajeet.loops.ForLoops;

import java.util.Scanner;

public class BreakWithInfiniteLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");

        for (; ; ) {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Sorry you enter a negative number");
                break;
            }
        }
    }
}
