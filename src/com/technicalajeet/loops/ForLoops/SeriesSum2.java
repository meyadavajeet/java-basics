package com.technicalajeet.loops.ForLoops;

import java.util.Scanner;

public class SeriesSum2 {
    public static void main(String[] args) {
        //        1/1-1/2+1/3-.......1/n  print the sum of this .
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        float result = 0;
        float n = sc.nextFloat();
        char sign = '+';
        for (float i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result -= 1 / i;
            } else {
                result += 1 / i;
            }
        }
        System.out.println(result);
    }
}
