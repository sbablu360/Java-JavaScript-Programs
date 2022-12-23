package com.example.java;

import java.util.Arrays;
import java.util.Scanner;

public class StringToCharArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
        System.out.println("Enter a string input: ");
        String str = scn.nextLine();
        char[] charArray = str.toCharArray();

//        for (int i = 0; i < charArray.length  ; i++) {
//            char ch = charArray[i]
//            System.out.println(ch);
//        }
        for (char c : charArray) {
            System.out.println(c);

        }
        Arrays.sort(charArray);


    }
}