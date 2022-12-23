package com.example.java;

import java.util.Scanner;

public class Pattern4 {


    public static void main(String[] args) {
        System.out.println("Enter a number for pattern: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1; //rows
        int nsp = n-1; // no of spaces
        int nst = 1; // no of stars
 // row
        while(row <= n){
            //space work
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            // work stars
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            // preparation step
            System.out.println();
            nst++;
            nsp--;
            row++;

        }

    }
}
