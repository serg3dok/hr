package String;

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
                for (int j = 0; j < B.length(); j++)
                {
                    if (A.charAt(i) == B.charAt(j))
                    {
                        if (found[j] == B.charAt(j))

                        break;
                    }

                    else if (j == B.length()-1) return false;
                }
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
}
