package String;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sergeyo on 12/23/2015.
 */
public class JavaAnagrams {
    static boolean isAnagram(String A, String B) {
        //Complete the function
        int[] found = new int[A.length()];
        if (A.length() == B.length())
        {
            for (int i = 0; i < A.length(); i++)
            {
                String a = sort(A);
                String b = sort(B);
                if(a.compareTo(b) == 0) continue;
                else return false;
            }
        }
        else return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }

    static String sort(String input)
    {
        char[] charArr = input.toLowerCase().toCharArray();
        char tmp;
        for (int i = 0; i < input.length()-1; i++)
        {
            if (Character.valueOf(charArr[i]) > Character.valueOf(charArr[i+1]))
            {
                tmp = charArr[i];
                charArr[i] = charArr[i+1];
                charArr[i+1] = tmp;
                for (int j = i; j > -1; j--)
                {
                    if (j > 0 && (Character.valueOf(charArr[j]) < Character.valueOf(charArr[j-1])))
                    {
                        tmp = charArr[j-1];
                        charArr[j-1] = charArr[j];
                        charArr[j] = tmp;
                    }
                }
            }
        }
        return String.valueOf(charArr);
    }
}
