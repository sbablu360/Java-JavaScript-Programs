import java.util.Scanner;

public class WavePrint {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] array = array2D();
        System.out.println("Entered Array: ");
        System.out.println(display2DArray(array));
        System.out.println("Display arr[2][0]: " + array[2][0]);
        System.out.println("WavePrint of given Array: ");
        System.out.println(wavePrint(array));

    }

    public static int[][] array2D() {
        System.out.println("Enter number of rows(m): ");
        int m = scn.nextInt();
        System.out.println("Enter number of columns(n): ");
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements (row-wise): ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static int display2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static int wavePrint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = arr[i].length-1; j >=0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }
        }

        return 0;
    }

}
