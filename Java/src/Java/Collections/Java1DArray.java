package Java.Collections;

import java.util.Scanner;

/**
 * Created by sergeyo on 2/23/2016.
 */
public class Java1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.next();
        int[] numbers = new int[n];
        int i = 0;
        while (sc.hasNext())
        {
            numbers[i] = sc.nextInt();
            i++;
        }

        int result = 0;
        int sum = numbers[0];
        for (i = 0; i < n; i++) {
            for (int j = i+1; j < n - 1; j++) {
                if (sum + numbers[j] < 0) {
                    sum = sum + numbers[j];
                    result = result + 1;
                }
                else
                {
                    break;
                }
            }
        }

        System.out.println(result);

    }
}
