package Algorithms.Strings;


import java.util.Scanner;


/**
 * Created by sergeyokinchuk on 7/28/16.
 */
public class SuperReducedString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();  // aaabccddd
        boolean printed = true;
        String result = "";


        while (printed) {
            printed = false;
            int i = -1;
            while (++i < input.length()-1) {
                if (input.charAt(i) == input.charAt(i+1)) {
                    i++;
                }
                else {
                    result += (input.charAt(i));
                    printed = true;
                }
            }
            if (i < input.length()) {
                result += (input.charAt(i));

                printed = true;
            }
            input = result;
        }

        System.out.println(result);

    }
}
