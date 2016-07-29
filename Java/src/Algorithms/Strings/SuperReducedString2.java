package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by sergeyokinchuk on 7/28/16.
 */
public class SuperReducedString2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        for (int i = 0; i < input.length()-1; i++) {

            if (input.charAt(i) == input.charAt(i+1)) i++ ;
            else {
                System.out.print(input.charAt(i));
            }
        }
        

    }
}
