package com.example.java;
/*
Author: @sbablu360
*/

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int row = 1;
        int nst = 1;
        while (row <= 2 * n - 1) {
            int cst = 1;
            if(nst<=n) {
                while (cst <= nst) {
                    System.out.print(" * ");
                    cst++;
                }
                System.out.println();
                row++;
                nst++;
            }

        }
    }
}