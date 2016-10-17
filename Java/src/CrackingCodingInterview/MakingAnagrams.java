package CrackingCodingInterview;


import java.util.Scanner;

/**
 * Created by Sergey on 9/28/2016.
 */
public class MakingAnagrams {

    //    i
    // abcfqegog
    //  j
    // sfswrhgnyfgo
    //
    // 21
    //


    public static int numberNeeded(String first, String second) {
        StringBuilder a = new StringBuilder(first);
        StringBuilder b = new StringBuilder(second);

        //System.out.println(a.charAt(3) == b.charAt(1));




        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {

                if (a.charAt(i) == b.charAt(j)) {
                    //System.out.println("here");
                    a.deleteCharAt(i);
                    b.deleteCharAt(j);
                    continue;
                }
            }
        }

        System.out.println(a);
        System.out.println(b);

        int toRemove = a.length() + b.length();
        return toRemove;
    }


    // remove char from string
    public static String removeCharFromString(String str, int index) {

        return str;
    }

    public static void main(String[] args) {

        String a = "abcfqe";
        String b = "sfswarh";
        System.out.println(numberNeeded(a, b));
    }

}
