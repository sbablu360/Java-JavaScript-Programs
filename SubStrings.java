package com.example.java;

import java.util.Scanner;

public class SubStrings {
    //Java program to print all possible substrings of a given string

        // Function to print all sub strings
        static void subString(char [] str, int n) {
            // Pick starting point
            for (int len = 1; len <= n; len++) {
                // Pick ending point
                for (int i = 0; i <= n - len; i++) {
                    /* Print characters from current
                     starting point to current ending
                     point.*/
                    int j = i + len - 1;
                    for (int k = i; k <= j; k++) {
                        System.out.print(str[k]);
                    }

                    System.out.println();
                }
            }
        }

        public static void main(String[] args) {
            //Added myself
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a String to find all possible sub-strings: ");
            String string = s.next();
            System.out.println("Entered string is : "+ '"'+string+'"');

            //Removed: char[] str = {'a', 'b', 'c', 'd'};
            char[] str = string.toCharArray();
            subString(str, str.length); //Calling subStrings Method and passing arguments
        }
    }



