package Implementation;

import java.util.Scanner;

/**
 * Created by Sergey on 12/10/2015.
 */
public class AngreeProfessor {


    static int numberOfTestCases;

    static int students;

    static int cancel;

    public static int[] arrival;

    static String[] yesNo;


    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        numberOfTestCases = stdin.nextInt();
        yesNo = new String[numberOfTestCases];

        for (int i = 0; i < numberOfTestCases; i++)
        {
            students = stdin.nextInt();
            cancel = stdin.nextInt();

            arrival = new int[students];
            for(int n = 0; n < arrival.length; n++)
                arrival[n] = stdin.nextInt();
            if (testCase() == false)
            {
                yesNo[i] = "YES";
            }
            else
            {
                yesNo[i] = "NO";
            }

        }

        for (int i = 0; i < numberOfTestCases; i++)
        {
            System.out.println(yesNo[i]);
        }

    }

    public static boolean testCase()
    {
        int arrived = 0;

        for (int i = 0; i < arrival.length; i++)
        {

            if (arrival[i] < 1)
            {
                arrived++;
            }
        }

        if (arrived >= cancel)
        {
            return true;
        }
        return false;
    }
}
