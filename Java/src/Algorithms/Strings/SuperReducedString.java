package Algorithms.Strings;

import java.util.*;

/**
 * Created by sergeyokinchuk on 7/28/16.
 */
public class SuperReducedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.equals("") || s.equals(null)) {
            System.out.println("Empty String");
            return;
        }

        char[] strArr = s.toCharArray();
        // List<Character> result = new ArrayList<Character>();
        boolean printed = false;


        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == strArr[i+1]) {

                //System.out.println(strArr[i] + " == " + strArr[i+1]);
                //i++ ;
                //i++ ;

            }
            else {
                System.out.print(strArr[i]);
                printed = true;
            }
        }



//        for (int i = 0; i < strArr.length-1; i++) {
//            if (strArr[i] != strArr[i+1]) {
//                System.out.print(strArr[i]);
//                printed = true;
//            }
//        }

        if (printed == false) {
            System.out.println("Empty String");
        }



    }
}
