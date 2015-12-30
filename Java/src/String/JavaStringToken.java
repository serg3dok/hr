package String;

import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * Created by Sergey on 12/23/2015.
 */
public class JavaStringToken {
    public static void main(String[] args)
    {


        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        //Complete the code

        StringTokenizer words = new StringTokenizer(s, " !,?.\\_'@");

        int count = words.countTokens();

        System.out.println(count);
        for(int i = 0; i < count; i++)
        {
            System.out.println(words.nextToken());
        }
    }
}
