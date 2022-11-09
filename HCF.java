package com.example.java;

import java.util.Scanner;

public class HCF {

    private static int getHCF(int firstInt, int secondInt){
        if(firstInt==0)
            return secondInt;
        if(secondInt==0)
            return firstInt;
        if(firstInt==secondInt)
            return firstInt;
        if(firstInt>secondInt)
            return getHCF(firstInt-secondInt, secondInt);

        return getHCF(firstInt, secondInt-firstInt);
    }

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int firstInt = s.nextInt();

        System.out.println("Enter the Second Number: ");
        int secondInt = s.nextInt();

        System.out.println("HCF of "+ firstInt+ " and " + secondInt +" is: "+ getHCF(firstInt, secondInt));
    }
}
