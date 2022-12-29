import java.util.Scanner;

/*
Author: Bablu Vishwakarma
*/
public class Functions {

    public static int val = 10;

    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Kindly Enter two Numbers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Sum of the above numbers is: ");
        int c = addition(a, b);
        System.out.println(c);
        System.out.println("val global " + val);
        int val = 12;
        System.out.println("val local " + val);
        int one = 102;
        int sum = DemoFun(one);
        System.out.println("sum " + sum);

    }

    public static int DemoFun(int one) {
        int sum = one + val;
        return sum;
    }

    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

}
