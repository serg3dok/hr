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

        BigDecimal[] result = new BigDecimal[n];

        //Write your code here
        for (int i = 0; i < n; i++) {
            result[i].equals(s[i]);
        }



        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }


}