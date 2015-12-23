import java.util.Scanner;

/**
 * Created by sergeyo on 12/22/2015.
 */
public class JavaLoops {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int t = stdin.nextInt();

        for (int i = 0; i < t; i++)
        {
            int a = stdin.nextInt();
            int b = stdin.nextInt();
            int n = stdin.nextInt();
            int c = a + b;
            int d = 2 * b;
            System.out.print(c);
            for (int j = 0; j < n-1; j++)
            {
                c = c + d;
                System.out.print(j==n-1?" "+c+"\n":" "+c);
                d=2*d;
            }
            System.out.println();

        }
    }
}
