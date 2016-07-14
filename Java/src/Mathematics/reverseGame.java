package Mathematics;

import java.util.Scanner;

/**
 * Created by sergeyo on 6/27/2016.
 */
public class reverseGame {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] balls = new int[n];
            for (int j = 0; j < n; j++) {
                balls[j] = j;
            }

            for (int j = 0; j < n; j++) {
                balls = reverse(balls);
            }



            balls = reverse(balls);
            System.out.println(balls[0]);
        }
    }

    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];

        int j = 0;
        for (int i = arr.length; i > -1; i--) {
            result[j++] =  arr[i];
        }
        return result;

    }
}
