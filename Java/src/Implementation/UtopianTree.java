package Implementation;

        import java.util.Scanner;

/**
 * Created by Sergey on 12/16/2015.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] result = new int[t];

        for(int a0 = 0; a0 < t; a0++){
            int h = 1;
            int n = in.nextInt();
            boolean odd = (n % 2 == 1);
            if (n > 0)
            {
                for(int j = 0; j < n; j += 2) {
                    h *= 2;
                    if ( n == 1 )
                        break;

                    if ( odd && j == n - 1 )
                        break;

                    h += 1;
                }

            }
            result[a0] = h;
        }

        for(int i = 0; i < t; i++) {
            System.out.println(result[i]);
        }
    }
}
