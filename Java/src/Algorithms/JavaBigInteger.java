import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by nataliiakovleva on 12/31/15.
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner stdin = new Scanner(System.in);
        BigInteger num1 = stdin.nextBigInteger();
        BigInteger num2 = stdin.nextBigInteger();

        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));

    }

}
