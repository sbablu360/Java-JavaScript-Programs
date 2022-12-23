package com.example.java;

import java.util.Scanner;

public class Pattern1 {
    public static void main (String [] args) {
        System.out.println("Enter a number for pattern: ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num  ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
            System.out.println();

        }
//TRIANGLE PATTERN
        for ( int k = 0; k < num; k++){

            for (int l = num-k; l <= num; l++) {
                System.out.print(" * ");

            }
            System.out.println();

        }
        for (int m = 0; m <= num ; m++) {
            for (int n = m; n <= num; n++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        
        }
    }

