package String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams1 {
    static boolean isAnagram(String A, String B) {
        //Complete the function
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean ret = isAnagram(A, B);
        if (ret) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
