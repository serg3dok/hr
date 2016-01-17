package thirtyDays;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by Sergey on 1/12/2016.
 */
public class day10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            int in = sc.nextInt();
            System.out.println(toBinary(in));
        }




    }
     static String toBinary(int num) {
        //return Integer.toBinaryString(x); // Integer method
        //String binaryResult = "0";
         StringBuilder binaryResult = new StringBuilder("0");

         int i = 0;
         while (num > 0)
         {

             i = binaryResult.length()-1;
             while (i > -1)
             {
                 if (binaryResult.charAt(i) == '0')
                 {
                     binaryResult.setCharAt(i, '1');
                     if (i == 0)
                     {
                         continue;
                     }

                 }
                 else if(binaryResult.charAt(i) == '1')
                 {
                     binaryResult.setCharAt(i, '0');


                     if (i == 0)
                     {
                         binaryResult.insert(0, '1');
                     }

                 }

                 i--;
             }



             num--;
         }





        return binaryResult.toString();
    }


}
