package thirtyDays;

import java.util.Scanner;

/**
 * Created by sergeyo on 1/11/2016.
 */
public class day6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);
        int h = stdin.nextInt();


        for (int i = 0; i < h; i++)
        {
            for(int j = h-1; j > i; j--)
            {
                System.out.printf(" ");


            }

            for (int k = 0; k <= i; k++)
            {
                System.out.printf("#");
            }

            System.out.println();

        }
    }

}
