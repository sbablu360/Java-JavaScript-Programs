package com.example.java;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Enter a number for pattern: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 0;

        while(i<n){
         int k = 0;
         while(k<=i){

             System.out.print(" * ");
             k++;
         }
            System.out.println();
         i++;

        }

    }
}
