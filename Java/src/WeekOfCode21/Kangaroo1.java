package WeekOfCode21;

import java.util.Scanner;

public class Kangaroo1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        int range = x1 > x2 ? x1 - x2 : x2 - x1;
        boolean closer = true;

        do {
            //System.out.println("Range: " + range);
            if (x1 == x2) {
                System.out.println("YES");
                return;
            }
            else {
                x1 =+ x1 + v1;
                x2 =+ x2 + v2;
                //System.out.println("x1 = " + x1);
                //System.out.println("x2 = " + x2);
            }

            if ((x1 > x2 ? x1 - x2 : x2 - x1) > range) {
                closer = false;
            }
            else
                range = x1 > x2 ? x1 - x2 : x2 - x1;

        } while (closer == true);
        System.out.println("NO");
    }
}
