package Algorithms;

import java.util.Scanner;

/**
 * Created by sergeyo on 7/20/2016.
 */
public class TheMaximumSubArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0) {

            int n = scan.nextInt();
            int[] arr = new int[n];
            int min = Integer.MIN_VALUE;

            int maxCon = min;
            int maxConAbs = min;

            int maxNotCon = min;
            int maxNotConAbs = min;

            int prev = 0;

            // assign values to array
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            // calculate Contiguous
            maxCon = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i]-arr[i-1] == 1 || arr[i]-arr[i-1] == -1 || arr[i] == arr[i-1]) {
                    maxCon += arr[i];
                }
                else {
                    if (maxCon > maxConAbs) {
                        maxConAbs = maxCon;
                        maxCon = 0;
                    }
                }
            }
            if (maxCon > maxConAbs) {
                maxConAbs = maxCon;
            }

            // calculate Not Contiguous
            int i = -1;
            while (i++ < n) {

                if (arr[i] < 0) continue;
                else {
                    maxNotCon = arr[i];
                    prev = arr[i];
                    break;
                }
            }
            while (++i < n) {
                if (arr[i] < 0) continue;
                else {
                    if (arr[i] - prev == 1 || arr[i] + prev == 1 || arr[i] == prev) {
                        maxNotCon += arr[i];
                    }
                    else {
                        if (maxNotCon > maxNotConAbs) {
                            maxNotConAbs = maxNotCon;
                            maxNotCon = 0;
                        }
                    }
                }
                prev = arr[i];
            }
            if (maxNotCon > maxNotConAbs) {
                maxNotConAbs = maxNotCon;
            }


            System.out.println(maxConAbs + " " + maxNotConAbs);
        }
    }

}
