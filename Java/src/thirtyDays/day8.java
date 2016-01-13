package thirtyDays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sergeyo on 1/12/2016.
 */
public class day8 {




    public static void main(String []argh)
    {
        Map dict = new HashMap();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            dict.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (dict.containsKey(s))
            {
                System.out.println(s + "=" + dict.get(s));
            }
            else
            {
                System.out.println("Not found");;
            }
        }
    }
}
