package String;

import java.util.Scanner;

/**
 * Created by sergeyo on 12/23/2015.
 */
public class JavaStringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int k = sc.nextInt();
        int n = line.length()-k;
        String min = line.substring(0, k);
        String max = line.substring(0, k);

        for (int i = 1; i < n+1; i++)
        {
            if (line.substring(i, i+k).compareTo(min) < 0)
            {
                min = line.substring(i, i+k);
            }
            if (line.substring(i, i+k).compareTo(max) > 0)
            {
                max = line.substring(i, i+k);
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
