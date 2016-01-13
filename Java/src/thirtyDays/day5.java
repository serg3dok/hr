package thirtyDays;

import java.util.Scanner;

/**
 * Created by sergeyo on 1/7/2016.
 */
public class day5 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int t = stdin.nextInt();
        for (int i = 0; i < t; i++)
        {
            int a = stdin.nextInt();
            int b = stdin.nextInt();
            int n = stdin.nextInt();
            int exponent = 2;
            int sum = 0;
            int previous = 0;


            for (int j = 0; j < n; j++)
            {
                if (j == 0)
                {
                    exponent = 1;
                    previous = 0;
                }
                else
                {
                    if (j == 1)
                        exponent = 2;
                    else
                        exponent = exponent * 2;

                }
                sum = exponent * b;

                System.out.print(a + sum + previous + " ");

                previous = sum + previous;
            }

            System.out.println();
        }
    }

}
