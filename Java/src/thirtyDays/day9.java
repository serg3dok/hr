package thirtyDays;

import java.util.Scanner;

/**
 * Created by Sergey on 1/12/2016.
 */
public class day9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = find_gcd(a, b);

        System.out.println(gcd);
    }
    static  int find_gcd(int a,int b) {
        //Write the base condition

//          return find_gcd(b,a%b);
            if (a > b) {
                return find_gcd(a - b, b);
            } else if (a < b) {
                return find_gcd(b - a, a);
            }
            return a;
    }




}
