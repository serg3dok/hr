/**
 * 
 */
package com.hackerRank.timeConversion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author sergeyo
 *
 */
public class TimeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		//System.out.print("Please enter time in 12hour format: ");
		String input = stdin.nextLine();		
		stdin.close();
		
		String[] timeString = input.split(":");
		
		int hours24 = 0;
		
//		int hours12 = Integer.valueOf(timeString[0]);
//		int minutes = Integer.valueOf(timeString[1]);
//		int seconds = Integer.valueOf(timeString[2].subSequence(0, 2).toString());
		
		
						
		Pattern regExDigits = Pattern.compile("\\dd?");		
		Matcher matcher = regExDigits.matcher(timeString[2]);
		
		
//		int seconds = Integer.valueOf(timeString[2].("(\\d+)"));		
		String ampm = timeString[2].subSequence(2, 4).toString();
//		String ampm = timeString[2].subSequence(2, 4).toString();
//		System.out.println(ampm);
		
		
		if (ampm.equals("PM") || ampm.equalsIgnoreCase("pm"))
		{
//			if (hours12 != 12)
//			{
//				hours24 = hours12 + 12;
//			}
		}
		
//		System.out.format(hours24 + ":" + minutes + ":" + seconds);
//		System.out.printf("%02d:%02d:%02d", hours24, minutes, seconds);
	}

}
