package DataStructures;

import java.util.Scanner;

public class ArrayDS2D {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        
        for (int y =0; y < 6; y ++) {
            for (int x =0; x < 6; x ++) {
                arr[x][y] = scan.nextInt();
            }            
        }
        
        int max = Integer.MIN_VALUE;
        
        for (int y =0; y < 4; y ++) {
            for (int x =0; x < 4; x ++) {
                if (max < arr[x][y] + arr[x+1][y] + arr[x+2][y] + 
                                     arr[x+1][y+1] + 
                   arr[x][y+2] + arr[x+1][y+2] + arr[x+2][y+2]) {
                    max = arr[x][y] + arr[x+1][y] + arr[x+2][y] + 
                                     arr[x+1][y+1] + 
                   arr[x][y+2] + arr[x+1][y+2] + arr[x+2][y+2];                    
                }
            }            
        }
        System.out.println(max);
        
    }
}
