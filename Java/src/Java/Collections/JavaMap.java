package Java.Collections;

import java.util.*;

/**
 * Created by sergeyo on 2/29/2016.
 */
public class JavaMap {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map dict = new HashMap<>();

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

            int found = 0;
            Iterator it = dict.keySet().iterator();
            //System.out.println(s);

            if (dict.containsKey(s))
            {
                System.out.println(s + "=" + dict.get(s));
            }
            else {
                System.out.println("Not found");
            }

//            while (it.hasNext()) {
//                Object key = it.next();
//                Object val = dict.get(key);
//                if (key.equals(s)) {
//                    System.out.println(key + "=" + val);
//                    found = 1;
//                }
//
//            }
//
//            if (found == 0) {
//                System.out.println("Not found");
//            }


        }
    }
}
