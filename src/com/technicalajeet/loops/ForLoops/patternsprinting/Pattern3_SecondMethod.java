package com.technicalajeet.loops.ForLoops.patternsprinting;

import java.util.Scanner;

public class Pattern3_SecondMethod {
    public static void main(String[] args) {

//                              * * * * * *
//                                * * * * *
//                                  * * * *
//                                    * * *
//                                      * *
//                                        *
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
