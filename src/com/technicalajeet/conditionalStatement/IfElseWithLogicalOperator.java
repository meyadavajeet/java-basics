package com.technicalajeet.conditionalStatement;

import java.util.Scanner;

public class IfElseWithLogicalOperator {
    public static void main(String[] args) {
        //Geting Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number");
        int initalNumber = sc.nextInt();

//        int initalNumber = 140;
//        int finalNumber;
        if (initalNumber > 0 && initalNumber <= 100) {
            System.out.println("Number is between 1 to 100 ");
        } else if (initalNumber > 100 && initalNumber <= 200)
            System.out.println("Number is between 100 to 200 ");
        else
            System.out.println("Number is Greater than 200");


        System.out.println("Please Enter your grade");
        int grade =sc.nextInt();

        if(grade ==10 || grade==12)
            System.out.println("You are eligiable to give exam");
        else
            System.out.println("you are not eligiable for examination");
    }
}
