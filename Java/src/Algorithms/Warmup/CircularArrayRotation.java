package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by sergeyo on 7/21/2016.
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();

        // create array n elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = scan.nextInt();
        }

        // rotate k times
        for (int i = 0; i < k; i++) {
            int tmp = arr[0];
            for (int j = 0; j < n-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[n-1] = tmp;

        }

        // query and return results
        for (int i = 0; i < q; i++) {
            int qn = scan.nextInt();
            System.out.println(arr[qn]);
        }

    }
}
