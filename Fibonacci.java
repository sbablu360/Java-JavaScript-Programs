package com.example.java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int num = s.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series with "+num+" term(s) is: ");

        for (int i = 0; i < num ; i++) {
            System.out.print(" "+a+" ");
            int temp = a;
            a = b;
            b = b + temp;



        }



    }
}
