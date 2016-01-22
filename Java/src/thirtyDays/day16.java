package thirtyDays;

import java.util.Scanner;

/**
 * Created by sergeyo on 1/21/2016.
 * Sorting!
 */
public class day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] digits = new int[input.nextInt()];
        int[] result = new int[digits.length];
        int tmp = 0;
        int min = 0;
        for (int i = 0; i < digits.length; i++) {
            digits[i] = input.nextInt();
        }



        // Sorting TODO: min can be negative
        for (int i = 0; i < digits.length; i++) {
            if(digits[i] > min ) min = digits[i];
        }


        for (int i = 0; i < digits.length-1; i++) {

            for (int k = i; k < digits.length-1; k++) {
                if (digits[i] > digits[k + 1])
                {
                    tmp = digits[i];
                    digits[i] = digits[k+1];
                    digits[k+1] = tmp;
                }
            }
            if (digits[i+1] - digits[i] < min)
            {
                min = digits[i+1] - digits[i];
            }
        }

        // Find minimum difference
        //int min;

        for (int i = 0; i < digits.length-1; i++) {
            if (digits[i+1] - digits[i] == min) System.out.println(digits[i] + " " + digits[i+1]);
        }
    }
}
