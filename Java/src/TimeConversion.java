import java.util.regex.*;
import java.util.Scanner;

/**
 * Created by Sergey on 8/18/2015.
 */
public class TimeConversion {
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);

        String[] time12 = stdin.nextLine().toString().split(":");

        String dayTime = "";
        if (time12[2].toUpperCase().contains("AM"))
        {
            dayTime = "am";
        }
        else if (time12[2].toUpperCase().contains("PM"))
        {
            dayTime = "pm";
        }

        int hours = 0;
        if (dayTime.equals("pm"))
        {
            //hours = Integer.valueOf(time12[0]) + 12;
        }

        //int minutes = Integer.valueOf(time12[1]);
        int seconds = 25;
//        int seconds = Integer.valueOf(time12[2].replace("(\\w+)", ""));
        String secString = time12[2].replace("\\w+", "");
        System.out.print(secString);
//        System.out.printf("%02d:%02d:%02d", hours, minutes,seconds);

    }
}
