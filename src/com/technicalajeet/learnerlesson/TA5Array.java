package com.technicalajeet.learnerlesson;

public class TA5Array {
    public static void main(String[] args) {
//        Array - Arrays are used to store multiple values of the same type.

        System.out.println("Array with numbers");
//        Wap in  java to store numbers 1 to 100 in an array.

        int[] arr = new int[100];
        //loop for assignin value in array
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        //loop for display array value one by using its index value
        for (int i = 0; i < 100; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("======================================");


        System.out.println("Array with String");

        String[] myStringArray = new String[]{"Sunil", "Paul", "Tom", "Mandeep","Ajeet","Yadav"};
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }

    }
}
