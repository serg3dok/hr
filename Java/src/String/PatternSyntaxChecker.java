package String;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by sergeyo on 12/23/2015.
 */
public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = "";
            pattern = in.nextLine();

            try
            {
                Pattern.compile(pattern);
            }
            catch (PatternSyntaxException e)
            {
                System.out.println("Invalid");
                continue;
            }
            System.out.println("Valid");

            testCases--;
        }
    }
}
