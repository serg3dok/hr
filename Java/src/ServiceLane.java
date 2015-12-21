import java.util.Scanner;

/**
 * Created by sergeyo on 12/18/2015.
 */
public class ServiceLane {

    private static int[] lane; // length of service lane
    private static int[] result; // vehicles
    private static int n; // length of the freeway
    private static int t; // number of test cases

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        n = stdin.nextInt();
        t = stdin.nextInt();
        lane = new int[n];
        result = new int[n];

        for (int i = 0; i < n; i++) // fill lane array
        {
            lane[i] = stdin.nextInt();
        }

        for (int i = 0; i < t; i++) // read testcases
        {
            int in = stdin.nextInt();
            int out = stdin.nextInt();
            result[i] = vehicle(in, out);
        }

        for (int i = 0; i < t; i++) // print out results
        {
            System.out.println(result[i]);
        }
    }

    private static int vehicle(int in, int out)
    {
        int car = 3;

        for (int i = in; i < out+1; i++)
        {
            if (lane[i] < car)
            {
                car = lane[i];
            }
        }

        return car;
    }
}
