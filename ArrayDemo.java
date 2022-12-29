import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        // System.out.println("Kindly Enter a Number: ");
        // int n = scn.nextInt();

        int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        System.out.print("IntArray: ");

        for (int val : intArray) {
            System.out.print(" ");
            System.out.print(val);
        }
        int i = 0;
        int j = 2;
        Swap(intArray, i, j);
        System.out.println();
        System.out.print("Swapped indices "+i+" and "+j+": ");
        System.out.println(intArray[i] + " " + intArray[j]);

    }

    public static void Swap(int[] intArray, int i, int j) {
        int temp = intArray[i];
        intArray[i]= intArray[j];
        intArray[j] = temp;

    }
}
