import java.util.Scanner;

/**
 * You are given an array of integers of size N. You need to print the sum of the elements of the array.
 * Input Format
 * The first line of the input consists of an integer N. The next line contains N space-separated integers describing the array.
 * Created by Sergey on 8/18/2015.
 */
public class simpleArraySum {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int n = Integer.valueOf(stdin.nextLine());
        String[] input = stdin.nextLine().toString().split(" ");
        long number = 0;
        for (int i = 0; i < n; i++)
        {
            number += Long.valueOf(input[i]);
        }

        System.out.print(number);
    }
}
