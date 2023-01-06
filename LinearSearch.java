import java.util.Scanner;

public class LinearSearch {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = inputArray();
        System.out.println("Entered Array: ");
        displayArray(array);
        linearSearch(array, 10);
    }

    public static int[] inputArray() {
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for " + i + " index: ");
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int linearSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println(i);
            }
        }
        return -1;
    }
}
