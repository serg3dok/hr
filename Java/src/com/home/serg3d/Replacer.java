package com.home.serg3d;

public class Replacer {

    public static void main(String[] args) {
	// write your code here
        replacer("abcdef", "ab", "gh");

    }

    public static void replacer(String a, String b, String c)
    {
        a= "abcdef";
        b="ab";
        c="gh";

        String arr[] = a.split("");
        String brr[] = b.split("");
        for(int i = 0; i < a.length(); i++)
        {
            for(int k = 0; k < b.length(); k++) {
                if (arr[i] == brr[k]) {
                    System.out.println(arr[i]);


                }
            }

        }

    }
}
