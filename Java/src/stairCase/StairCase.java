package stairCase;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		stdin.close();
		for (int i = 1; i <= n; i++)
		{
			
			for (int j = n; j >= 1; j--)
			{
				if (j > i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("#");
				}
				
			}
			System.out.println();
		}
	}
}
