package CrackingCodingInterview;


import java.util.Arrays;

/**
 * Created by Sergey on 9/28/2016.
 */
public class MakingAnagrams3 {

    //    i
    // abcfqegog
    //  j
    // sfswrhgnyfgo
    //
    // 21
    //


    public static int numberNeeded(String first, String second) {
        //StringBuilder a = new StringBuilder(first);
        //StringBuilder b = new StringBuilder(second);



        char[] a = first.toCharArray();
        char[] b = second.toCharArray();

        int sum = a.length + b.length;
        int match = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) return 0;

        int i = 0;
        int j = 0;
        while (i < a.length) {
            if (j == b.length) break;
            if (a[i] < b[j]) i++;
            else if (b[j] < a[i]) j++;
            else {
                match++;
                i++;
                j++;
            }
        }

        return sum  - match * 2;
    }

    // remove char from string
    public static String removeCharFromString(String str, int index) {

        return str;
    }

    public static void main(String[] args) {
        String a = "abcfqe";
        String b = "sfswrh";
        System.out.println(numberNeeded(a, b));
    }

}
