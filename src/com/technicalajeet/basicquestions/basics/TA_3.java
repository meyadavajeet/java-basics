package com.technicalajeet.basicquestions.basics;

import java.util.Scanner;

// 3) Write a Program to Add Two Integer Numbers Entered by User
public class TA_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first number ");
    int firstNumber = sc.nextInt();
    System.out.println("enter second number");
    int secondNumber = sc.nextInt();
    int result = 0;
    result = firstNumber + secondNumber;
    System.out.println("sum of two number is "+result);

  }    
}
