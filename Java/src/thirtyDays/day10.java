package thirtyDays;

import java.util.Scanner;

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

         String last = "";
         while (num > 0) {
             int mod = num % 2;
             num = num / 2;
             String binary = Integer.toString(mod);
             last = mod + last;
         }

         return last;
    }


}
