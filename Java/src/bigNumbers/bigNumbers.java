package bigNumbers;

import java.io.IOException;
import java.util.Scanner;

public class bigNumbers {
	
	private static long sum = 0;
	

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    	Scanner input = new Scanner(System.in);
    	
    	String n = input.nextLine();
    	String inputNumbers = input.nextLine();
    	input.close();
    	       
        String[] numbersString = inputNumbers.split(" ");

        if (Integer.valueOf(n) != numbersString.length)
        {
        	throw new IOException("wrong input");
        }
        
        for (int i = 0; i < numbersString.length; i++)
        {
        	sum = sum + Long.valueOf(numbersString[i]);
        }
                       
        System.out.println(sum);        
     }    
}