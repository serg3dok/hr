package JavaBigNumber;
import java.math.BigDecimal;
import java.util.Scanner;


class JavaBigDecimal{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        // Write your code here

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {


                BigDecimal a = new BigDecimal(s[j]);
                BigDecimal b = new BigDecimal(s[j + 1]);

                if (a.compareTo(b) < 0) {
                    String tmp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = tmp;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }

}