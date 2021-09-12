package com.technicalajeet.basicquestions.basics;

import java.util.Scanner;

//Print average of three given number
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int n1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int n2 = scanner.nextInt();
        System.out.println("Enter Third number");
        int n3 = scanner.nextInt();
//        double average = ((n1 + n2 + n3) / 3F);
//        System.out.println("Average of n1,n2 and n3 = " + average);
        findAvg(n1,n2,n3);
    }
    public static void findAvg(int a, int b,int c){
        int sum = a + b + c;
        float avg =  sum/3F;
        System.out.println("Average of n1,n2 and n3 = " + avg);
    }
}
