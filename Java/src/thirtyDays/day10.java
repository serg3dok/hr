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
    static String toBinary(int x) {
        //return Integer.toBinaryString(x); // Integer method
        int binaryResult = 0;
        while(x > 0)
        {
            if (binaryResult%10 == 0) {
                binaryResult++;
                x-- ;
            }

            else if (binaryResult%10 != 0 && binaryResult == 1){
                binaryResult += 9;
                x--;
            }

//            else if(binaryResult > 100 && binaryResult%10 != 0)
//            {
//                binaryResult += 10;
//            }

            if (binaryResult > 10 && !String.valueOf(binaryResult).contains("0"))
            {
                //binaryResult += 89;
                String n = "1";
                int l = Integer.toString(binaryResult).length();
                for (int i = 0; i < l; i++)
                {
                    n = n + "0";
                }
                //n = n + "0";
                binaryResult = Integer.valueOf(n);

                x--;
            }


        }

        return String.valueOf(binaryResult);



    }




}
