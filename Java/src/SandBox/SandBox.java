package SandBox;

import java.util.Scanner;

/**
 * Created by sergeyo on 12/16/2015.
 */
public class SandBox {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int a = stdin.nextInt();
        int b = stdin.nextInt();

        System.out.println("var a = " + a);
        System.out.println("var b = " + b);
    }
}
