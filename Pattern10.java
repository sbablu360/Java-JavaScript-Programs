package com.example.java;
/* 
Author: @sbablu360
*/

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int row = 1;
        int nst = n;
        while (row <= n){
            int cst = 1;
            while(cst <= nst){
                System.out.print(" * ");
                cst++;
            }
            System.out.println();
            row++;
            nst--;
        }

    }
}
