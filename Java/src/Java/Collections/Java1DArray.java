package Java.Collections;

import java.util.Scanner;

/**
 * Created by sergeyo on 2/23/2016.
 */
public class Java1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }




        int result = 0;

        for (int i = 0; i < n; i++) {
            int sum = numbers[i];
            if (sum < 0) result += 1;
            for (int j = i+1; j < n; j++) {
                int nextNum = numbers[j];
                if (sum + nextNum < 0) {

                    result = result + 1;
                }

                sum = sum + nextNum;
            }
        }

        System.out.println(result);

    }
}
