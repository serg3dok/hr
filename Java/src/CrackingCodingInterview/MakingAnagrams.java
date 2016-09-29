package CrackingCodingInterview;

import java.util.Scanner;

/**
 * Created by Sergey on 9/28/2016.
 */
public class MakingAnagrams {

    //      i
    // abcfqe
    //      j
    // sfswrh
    // dd ee gg
    // 12


    public static int numberNeeded(String first, String second) {
        StringBuilder a = new StringBuilder(first);
        StringBuilder b = new StringBuilder(second);

        for (int i = 0; i < a.length(); i++) {
            for (int j = i+1; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    a.deleteCharAt(i);
                    b.deleteCharAt(j);
                    continue;
                }
            }
        }

        int toRemove = a.length() + b.length();
        return toRemove;
    }

    public static void main(String[] args) {

        String a = "cde";
        String b = "abc";
        System.out.println(numberNeeded(a, b));
    }

}
