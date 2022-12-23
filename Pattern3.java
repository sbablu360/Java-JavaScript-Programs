package com.example.java;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("Enter a number for pattern: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 0;

        //Implemented using while loop.

        while(i<n){
            int j = 0;
            while(j<=i) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();

            i++;

        }
        // won't run because value of int i=n. comment out to run
        while(i<n){
            int j = 0;
            while(j<n-i) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();

            i++;

        }

    }
}
