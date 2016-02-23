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
        
        //Create array of BigDecimals
        BigDecimal[] arrIn = new BigDecimal[n];                
        for (int i = 0; i < n; i++) {            
            arrIn[i] = new BigDecimal(s[i]);
        }
        
        // Sort in loops
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < i; j++) {

                if (arrIn[i].compareTo(arrIn[j]) < 0)
                {
                    BigDecimal tmp = (arrIn[i]);
                    arrIn[i] = arrIn[j];
                    arrIn[j] = tmp;
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