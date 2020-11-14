package com.technicalajeet.loops.ForLoops;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
//        1/1+1/2+1/3+.......1/n  print the sum of this .
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        float result = 0;
        for(float i =1 ; i<=n; i++){
            result += 1/i;
        }
        System.out.println(result);
    }
}
