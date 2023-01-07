import java.util.Scanner;

public class BubbleSort {
    //    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = {66, 55, 44, 33, 22, 11};
        int[] array = bubbleSort(arr);
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}