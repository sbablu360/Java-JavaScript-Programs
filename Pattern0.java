package com.example.java;

import java.util.Scanner;

public class Pattern0 {
    public static void main (String [] args) {
        System.out.println("Please enter a number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
for(int i = 1; i <= n; i++) {
    for (int j = 1; j <=n ; j++) {
        for (int k = 0; k < n-2; k++) {
            System.out.print("  *  ");

        }
    }
    System.out.println();

}
    }
}
