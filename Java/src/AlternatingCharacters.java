import java.util.Scanner;

/**
 * Created by Sergey on 12/18/2015.
 */
public class AlternatingCharacters {

    private static int t; // number of test cases
    private static String input; // input lines
    private static char[][] charsInput;

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        Scanner stdinline = new Scanner(System.in);
        t = stdin.nextInt();

        for (int i = 0; i < t; i++)  // read strings
        {
            String inputString = stdinline.nextLine();
            int l = inputString.length(); // current string length

        }

        for (int i = 0; i < t; i++)  // write to char arrays
        {
            String inputString = stdinline.nextLine();
            int l = inputString.length(); // current string length
            for (int j = 0; j < l; j++)
            {
                char tmp = inputString.charAt(j);
                charsInput[i][j] = inputString.charAt(j);
            }
        }

        for (int i = 0; i < t; i++)  // analyze and print results
        {
            for (int j = 0; j < charsInput[i].length-1; j++)
            {
                int counter = 0;
                for (int k = 0; k < charsInput[i].length-1; k++)
                {
                    if ((charsInput[j] == charsInput[k]) && (j != k))
                    {
                        counter++;
                    }
                }

                System.out.println(counter);
            }
        }
    }
}
