package com.technicalajeet.loops.ForLoops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number to check is it prime or not");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        }
//        for (int i = 2; i <= n / 2; i++) {
        for (int i = 2; i * i < n / 2; i++) { //here the loop goes to underroot of n
            if (n % i == 0) {
                isPrime = false;
                break;
            }


        }
        System.out.println("isPrime " + isPrime);

    }
}
