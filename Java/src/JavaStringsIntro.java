import java.util.Scanner;

/**
 * Created by sergeyo on 12/21/2015.
 */
public class JavaStringsIntro {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String a = stdin.next();
        String b = stdin.next();
        // 1
        int sum = a.length() + b.length();
        System.out.println(sum);

        //2
        if (a.compareTo(b) > 0)
            System.out.println("Yes");
        else
            System.out.println("No");

        //3
        String sentence = a + " " + b;
        System.out.println(capitalize(sentence));



    }

    public static String capitalize(String str)
    {

        String[] words = str.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++)
        {
            if (i == 0)
                result = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
            else
                result = result + " " + words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return result;
    }
}
