package plusminus;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());		

		String[] numbers = sc.nextLine().split(" ");		
		sc.close();
		int number = 0;
		
		double positive = 0;
		double negative = 0;
		double zero = 0;
		
		for (int i = 0; i < n; i++)
		{
			number = Integer.valueOf(numbers[i]);
			if (number > 0)
			{
				positive++;
			}
			else if (number < 0)
			{
				negative++;
			}
			else
			{
				zero++;
			}
		}	
		
		System.out.println(String.format("%.3f", positive/n));
		System.out.println(String.format("%.3f", negative/n));
		System.out.println(String.format("%.3f", zero/n));
	}
}
