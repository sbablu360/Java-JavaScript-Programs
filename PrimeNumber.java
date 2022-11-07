package com.example.java;
import java.util.Scanner;
public class PrimeNumber {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = s.nextInt();
        int i = 2;

        if (a==1){
            System.out.println(a+" is neither Prime nor Composite!");
        }
        else if (a==2){
            System.out.println(a+" is a Prime Number.");

        }
       else if ( a%i == 0 ) {
           System.out.println(a+" is not a Prime Number.");
            i++;

        }

       else if (a%i!=0){
            System.out.println(a+" is not a Prime Number!");

        }
else {
            System.out.println(a+" is a Prime Number!");

        }
    }
}
