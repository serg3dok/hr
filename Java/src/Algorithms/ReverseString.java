package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sergeyokinchuk on 7/21/16.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        char[] strArr = str.toCharArray();
        List<String> spaces = new ArrayList<String>();
        List<String> words = new ArrayList<String>();
        int i = 0;
        while (i < strArr.length-1) {
            if (strArr[i] == ' ') {
                String s = "";
                while (strArr[i] == ' ') {
                    s = s + " ";
                    if (i < strArr.length-1) i++;
                    else break;
                }
                spaces.add(s);

            }

            if (strArr[i] != ' ') {
                String w = "";
                while (strArr[i] != ' ') {
                    w = w + strArr[i];
                    if (i < strArr.length-1) i++;
                    else break;
                }
                words.add(w);

            }

        }

        Collections.reverse(words);

        for (int j = 0; j < words.size()-1; j++) {
            System.out.println(words.get(j));
            System.out.println(spaces.get(j));
        }



    }
}
