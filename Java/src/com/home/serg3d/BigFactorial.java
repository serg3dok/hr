package com.home.serg3d;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Sergey on 10/21/2015.
 */
public class BigFactorial {

    public static BigInteger result;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long input = scan.nextLong();
        scan.close();
        //findFactorial(input);
        System.out.println(findFactorial(input));
    }

    public static BigInteger findFactorial(long number)
    {
        if (number < Long.valueOf(2))
        {
            return BigInteger.valueOf(1);
        }
        else {

            result = BigInteger.valueOf(number).multiply((findFactorial(number - 1)));
            System.out.println(result);
            return result;
        }

    }

}
