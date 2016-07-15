package Algorithms;

import java.io.*;
import java.util.*;


import java.util.Scanner;

/**
 * Created by nataliiakovleva on 7/11/16.
 */
public class TheMaximumSubarray {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int t = stdIn.nextInt();

        while (t-->0) {

            int n = stdIn.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = stdIn.nextInt();


            }

            int maxContig = Integer.MIN_VALUE;
            int maxNonContig = Integer.MIN_VALUE;

            //int i = 0;

            for (int i = 0; i < n; i++) { //
                int max = i;
                int maxNoNegative = 0;
                if (i < 0)  continue;
                else maxNoNegative = i;

                while (a[i+1]-a[i] == 1 || a[i+1] + a[i] == 1 || i < a.length) {
                    max += a[i];
                    if (i > 0) maxNoNegative += a[i];
                    i++;
                }

                if (max > maxContig) maxContig = max;
                if (maxNoNegative > maxNonContig) maxNonContig = maxNoNegative;

            }

            System.out.println(maxContig + " " + maxNonContig);

        }

    }

}
