package com.technicalajeet.loops.ForLoops;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 35) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
