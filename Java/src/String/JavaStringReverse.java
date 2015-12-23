package String;

import java.net.SocketPermission;
import java.util.Scanner;


public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] aChars = new char[a.length()];
        aChars = a.toCharArray();
        if (palindrome(aChars))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    public static boolean palindrome(char[] a)
    {
        int l = a.length;
        for (int i = 0; i < l; i++)
        {
            if (a[i] != a[l-i-1])
            {
                return false;
            }
        }
        return true;
    }
}
