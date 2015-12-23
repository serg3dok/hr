import java.util.Scanner;

/**
 * Created by sergeyo on 12/22/2015.
 */
public class JavaEndofFile {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int lineNumber = 1;
        while (stdin.hasNext())
        {
            System.out.println(lineNumber + " " + stdin.nextLine());
            lineNumber++;
        }

    }
}
