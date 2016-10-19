package CrackingCodingInterview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Sergey on 10/19/2016.
 */
public class RansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        System.out.println(ransomNote(magazine, ransom));
    }

    /*
        1. put magazine into hash map, words as keys, number of words as values
        2. iterate through ransom words
        3. if magazine contains ransom word remove 1 from value of that word

     */

    public static String ransomNote(String[] magazine, String[] ransom) {

        Map<String, Integer> magazineHashTable = new HashMap<>();


        for (int i = 0; i < magazine.length; i++) {
            if (!magazineHashTable.containsKey(magazine[i])) {
                magazineHashTable.put(magazine[i], 1);
            } else {
                int value = magazineHashTable.get(magazine[i]);
                magazineHashTable.replace(magazine[i], value, ++value);
            }

        }
        // now we have hash table where key are unique words and values are number of that words
        // further we can iterate through ransom words and remove number of words from hash table


        for (int i = 0; i < ransom.length; i++) {
            if (!magazineHashTable.containsKey(ransom[i])) return "No";
            if (magazineHashTable.containsKey(ransom[i])) {
                int value = magazineHashTable.get(ransom[i]);
                if (value == 0) return "No";
                magazineHashTable.replace(ransom[i], value, --value);
            }
        }

        return "Yes";
    }
}
