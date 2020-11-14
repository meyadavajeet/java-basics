package com.technicalajeet.loops.ForLoops.nestedforloop;

public class TableUsingNestedForLoops {
//print table from 1 to 20 in a row and column
    public static void main(String[] args) {
        int table =1;
        for (int i = 1; i <= 20; i++) {
            int tableOf = i;
            for (int k = 1; k <= 10; k++) {
                table = tableOf * k;
                System.out.print(table + " ");
            }
            System.out.println();
        }
    }
}
