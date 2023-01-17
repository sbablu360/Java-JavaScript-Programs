import java.util.Scanner;

/* Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’.
The length of the string is variable.
The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string.
The string is considered valid if the number of ‘*’ and ‘#’ are equal.
The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1: ###***   -> Value of S
Output : 0   → number of * and # are equal
*/
public class TCS01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = scn.nextLine();
        System.out.println(ValidString(str));
    }

    public static int ValidString(String str) {
        char[] charArray = str.toCharArray(); // str.charAt[i] could also be used
        int countStar = 0;
        int countHash = 0;
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == '*') {
                countStar++;
            } else if (charArray[i] == '#') {
                countHash++;
            }
        }
        System.out.println("No of Stars: " + countStar);
        System.out.println("No of Hashes: " + countHash);
        return (countStar - countHash);

    }

}

