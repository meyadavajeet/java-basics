package com.technicalajeet.loops.ForLoops.nestedforloop;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int j = 1; j <= 1000000; j++) {
            for (int i = 1; i <= 50; i++) {
                System.out.print(+i + " ");
            }
            System.out.println(j + " ");
        }
    }
}
