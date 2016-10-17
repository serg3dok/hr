package CrackingCodingInterview;


import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Sergey on 9/28/2016.
 */
public class MakingAnagrams1 {

    //    i
    // abcfqegog
    //  j
    // sfswrhgnyfgo
    //
    // 21
    //


    public static int numberNeeded(String first, String second) {

        int counter = 0;

        List<Character> longChars = new ArrayList<>();
        if (first.length() < second.length()) {
//          List<Character> longChars = new ArrayList<>(second.chars().mapToObj(value -> (char) value).collect(Collectors.toList()));
            for (int i = 0; i < second.length(); i++) { // add chars to list
                longChars.add(second.charAt(i));
            }

            Collections.sort(longChars);

            for (int i = 0; i < first.length(); i++) {
                if (longChars.contains(first.charAt(i))) {
                    counter ++;
                }
            }
        } else {
            for (int i = 0; i < first.length(); i++) { // add chars to list
                longChars.add(first.charAt(i));
            }

            Collections.sort(longChars);

            for (int i = 0; i < second.length(); i++) {
                if (longChars.contains(second.charAt(i))) {
                    counter ++;

                }
            }
        }

        return first.length() + second.length() - counter * 2;
    }


    // remove char from string
    public static String removeCharFromString(String str, int index) {

        return str;
    }

    public static void main(String[] args) {

        String a = "abcfqe";
        String b = "asfswarh";
        System.out.println(numberNeeded(a, b));
    }

}
