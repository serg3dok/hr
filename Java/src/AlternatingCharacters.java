import java.util.Scanner;

/**
 * Created by Sergey on 12/18/2015.
 */
public class AlternatingCharacters {

    private static int t; // number of test cases
    private static String[] input; // input lines
    private static char[][] charsInput;

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        Scanner stdinLine = new Scanner(System.in);
        t = stdin.nextInt();
        input = new String[t];
        int maxLength = 0;


        for (int i = 0; i < t; i++)  // read strings
        {
            input[i] = stdinLine.nextLine();
            System.out.printf(input[i]);

            if (maxLength < input[i].length())
            {
                maxLength = input[i].length();
            }
        }

        charsInput = new char [t-1][maxLength-1];

        for (int i = 0; i < t; i++)  // write to char arrays
        {
            int l = input[i].length(); // current string length
            for (int j = 0; j < l; j++)
            {
                charsInput[i][j] = input[i].charAt(j);
            }
        }

        for (int i = 0; i < t; i++)  // analyze and print results
        {
            for (int j = 0; j < charsInput[i].length; j++)
            {
                int counter = 0;
                for (int k = 0; k < charsInput[i].length; k++)
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
