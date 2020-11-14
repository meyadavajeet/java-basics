package com.technicalajeet.learnerlesson;

public class TA6MethodOverloading {
    public static void main(String[] args) {
        final String defination = "Method Overloading means, when two or more methods have the same name but different parameters.";
        System.out.println(defination);

        int firstNum = 5;
        int secondNum = 8;
        int thirdNum = 2;
        int addedResult1;
        int addedResult2;
        //first method called
        addedResult1 = add(firstNum, secondNum);
        System.out.println("The added value of two numbers is : " + addedResult1);

        //overloaded method called here
        addedResult2 = add(firstNum, secondNum, thirdNum);
        System.out.println("The added value of three numbers is : " + addedResult2);
    }

    //Add method starts here.
    static int add(int firstNumber, int secondNumber) {
        int result;
        result = firstNumber + secondNumber;
        return result;
    }

    //Overloaded Add method starts here.
    static int add(int firstNumber, int secondNumber, int thirdNumber) {
        int result;
        result = firstNumber + secondNumber + thirdNumber;
        return result;
    }
/**
 * Note : We have added 'static' keyword in front of the method, so that it could be accessed from main method.
 */

}
