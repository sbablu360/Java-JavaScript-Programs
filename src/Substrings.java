import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kindly Enter a String: ");
        String strInput = scn.nextLine();
        System.out.println(strInput);

        String str = "HELLO! ";
        System.out.println(str);
        System.out.println(str.length()); // space counts
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        String str1 = str + strInput + "!";
        System.out.println(str1);

        //Substring method
        System.out.println(str.substring(2, str.length() - 2));
        System.out.println(str.substring(0, 0));
        System.out.println(str.substring(5, str.length()));
        System.out.println(str.substring(1));

        // To print all substrings of a given string
        for (int i = 0; i < strInput.length(); i++) {
            for (int j = i + 1; j < strInput.length() + 1; j++) {
                //System.out.println(i+", "+j);
                System.out.println(strInput.substring(i, j));
            }

        }
    }
}
