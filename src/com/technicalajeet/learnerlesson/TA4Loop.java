package com.technicalajeet.learnerlesson;

public class TA4Loop {
    public static void main(String[] args) {
        System.out.println("------------//        while loop ------------");

        int num = 1;
        while (num <= 10) {
//            System.out.println(num++);
            System.out.println(num);
            num += 1;
        }
        System.out.println("===============================   //using for loop");




        for (int n = 1; n <= 10; n++) {
            System.out.println(n);
        }

        System.out.println("++++++++ //using do while loop +++++++++++");

        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number <= 10);


    }
}

