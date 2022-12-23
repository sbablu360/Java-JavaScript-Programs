package com.example.java;
/* 
Author: @sbablu360
*/

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scn.nextInt();
        int nst = n;
        int nsp = 0;
        int row = 1;
        //rows
         while(row <= n){
           // work for spaces
           int csp = 1;
           while(csp <= nsp){
               System.out.print(" ");
               csp++;
           }
           // work for stars
             int cst = 1;
           while(cst <= nst ){
               System.out.print("*");
               cst++;
           }
             System.out.println();
           row++;
           nst--;
           nsp++;


         }

    }
}
