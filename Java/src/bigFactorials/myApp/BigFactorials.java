package bigFactorials.myApp;
import java.util.Scanner;


public class BigFactorials {

	public static long fact = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long input = scan.nextLong();
		scan.close();
		System.out.println((findFactorial(input)));		
	}
	
	private static long findFactorial(long number)
	{
		if (number == 1)
				{
			return 1;
				}
		else
		{
			
			fact = (number * findFactorial(number - 1) );
			System.out.println(fact);
			
		}		
		return fact;
	}

}

