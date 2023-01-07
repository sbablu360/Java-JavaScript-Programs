import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = inputArray();
        System.out.println("Entered Array: ");
        displayArray(array);
        Arrays.sort(array);
        System.out.println("Sorted Array: ");
        for (int num : array) {
            System.out.println(num);
        }
        // int array1[] = {-44, -33, 11, 22, 33, 45, 55, 66, 89, 99};

        System.out.println(binarySearch(array, 66));

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

    public static int binarySearch(int[] arr, int item) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] < item) {
                lo = mid + 1;
            } else if (arr[mid] > item) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
