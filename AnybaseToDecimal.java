import java.util.Scanner;

public class AnybaseToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kindly Enter the Source Number: ");
        int sNo = scn.nextInt();
        System.out.println("Kindly Enter the Source Base: ");
        int sb = scn.nextInt();
        int dNo = anyBaseToDecimal(sNo, sb);
        System.out.println("Equivalent Decimal value of " + sNo + " :");
        System.out.println(dNo);
    }
    public static int anyBaseToDecimal(int sNo, int sb) {
        int n = 0;
        for (int i = 0; i < sNo+3; i++) {
            int rem = sNo % 10;
            sNo = sNo / 10;
            n += (int) (rem * Math.pow(sb, i));
        }
        return n;
//        int n = 0;
//        int multiplier = 0;
//        while (sNo > 0) {
//            int rem = sNo % 10;
//            sNo = sNo / 10;
//            n += (int) (rem * Math.pow(sb, multiplier));
//            multiplier++;
//        }

    }
}







