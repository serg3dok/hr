package training;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] workingDays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"}; 
		
		//List<String> days = Arrays.asList(workingDays);
		
//		Collections.reverse(days);
//
//		workingDays = (String[]) days.toArray();
		
		for (int i = 0; i < workingDays.length; i++)
		{
			System.out.println(workingDays[i]);
		}
		
		
		

	}

}
