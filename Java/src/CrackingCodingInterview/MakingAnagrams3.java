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



        char[] aaa = first.toCharArray();
        char[] bbb = second.toCharArray();

        int result = aaa.length + bbb.length;
        int counter = 0;

        Arrays.sort(aaa);
        Arrays.sort(bbb);

        if (aaa.length >= bbb.length) {
            int j = 0;
            for (int i = 0; i < bbb.length; i++) {
                while (aaa[i] <= bbb[j] && i < bbb.length) {
                    j++;
                }
                if (aaa[i] == bbb[j]) {
                    counter++;
                }
            }
        }

        result = result - counter * 2;

        //int toRemove = a.length() + b.length();
        return result;
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
