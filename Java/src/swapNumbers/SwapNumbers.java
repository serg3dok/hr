package swapNumbers;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		int num2 = 30;		
		
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		System.out.println(swap(num1, num2));		
	}
	
	private static String swap(int n1, int n2)
	{
		n1 = n1 + n2;
		n2 = n1 - n2; 
		n1 = n1 - n2;
		return "num1 = " + n1 + ", num2 = " + n2;
	}

}
