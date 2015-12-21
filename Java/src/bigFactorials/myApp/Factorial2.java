package bigFactorials.myApp;

import java.util.Scanner;

public class Factorial2 {

	public static long result;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
	}
	
	private static long calculation(int number)
	{
		if (number <= 1)
			return 1;
		else
		{
			result = (calculation(number - 1) * number);
			System.out.println(result);
			return result;
		}
		
	}

}
