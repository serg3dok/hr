import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sergeyo on 12/21/2015.
 */
public class AlternatingCharactersList {

    private static int t; // number of test cases
    private static ArrayList<String> input;
    private static ArrayList<Character>[] inputChars;

    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        Scanner stdinLine = new Scanner(System.in);

        t = stdin.nextInt();

        for (int i = 0; i < t; i++)
        {
            input.add(i, stdinLine.nextLine());


            for (int j = 0; j < input.size(); j++)
            {
//                inputChars[i].add(j, input.);
            }

        }


    }
}
