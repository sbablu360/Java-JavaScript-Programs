import java.util.Scanner;

import static java.lang.Math.pow;

public class AnyBaseToAnyBase {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kindly Enter the Source Number: ");
        int sNum = scn.nextInt();
        System.out.println("Kindly Enter the Source Base: ");
        int sb = scn.nextInt();
        int dNum = AnyBaseToDec(sNum, sb);
        System.out.println("Equivalent Decimal value of " + sNum + " in Decimal Number System: ");
        System.out.println(dNum);
        System.out.println("Kindly Enter the Destination Base: ");
        int db = scn.nextInt();
        int res = DecToAnyBase(dNum, db);
        System.out.println("Equivalent value of "+ sNum+ " in "+"Base "+ db);
        System.out.println(res);
    }

    public static int AnyBaseToDec(int sNum, int sb) {
        int n = 0;
        int multiplier = 0;
        while (sNum > 0) {
            int rem = sNum % 10;
            sNum = sNum / 10;
            n += (int) (rem * pow(sb, multiplier));
            multiplier++;
        }
        return n;
    }
    public static int DecToAnyBase(int dNum, int db) {
        int n = 0;
        int multiplier = 0;
        while (dNum > 0) {
            int rem = dNum % db;
            dNum = dNum / db;
            n += (int) (rem * pow(10, multiplier));
            multiplier++;
        }
        return n;
    }

}
