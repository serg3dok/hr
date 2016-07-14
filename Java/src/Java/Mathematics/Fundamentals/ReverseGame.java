import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] balls = new int[n];
            for (int j = 0; j < n; j++) {
                balls[j] = j;
            }
            balls = reverse(balls);
            System.out.println(balls[0]);
            

        }
    }
    
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            result[i] =  arr[arr.length-i-1];
        }
        return result;
        
    }
}