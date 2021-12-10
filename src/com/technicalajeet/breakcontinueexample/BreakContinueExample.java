package com.technicalajeet.breakcontinueexample;

public class BreakContinueExample {
    public static void main(String[] args) {
        for(int i =0; i<=100; i++){
            System.out.println(i);
            if(i==30){
                continue; //it will not execute all code below this line in loop and goes for the next iteration
            }
            if(i == 50){
                break;
            }
            System.out.println("end for every iteration");
        }
    }
}
