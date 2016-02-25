package Java.Collections;

import java.util.Scanner;

/**
 * Created by sergeyo on 2/24/2016.
 */
public class Java1DArrayHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int index = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            for (int j = 0; j < n; j++) {
                if (arr[j] == 0) {
                    index = index + 1;
                }

                else if  ((j + m - 1) >= n) {
                        index = n;
                        break;
                    }
                else if  ((j + m - 1) < n) {
                    if (arr[j + m - 1] == 0) {
                        index = index + m;
                    }
                }
                else if (arr[j - 1] == 0) {
                        index = index - 1;
                }
                else {
                    break;
                }

            }
            if (index+1 >= n) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
