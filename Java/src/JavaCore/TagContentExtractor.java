import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution{
   public static void main(String[] args){

      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String line = in.nextLine();

             //Write your code here

            String openTag = "";
            String closeTag = "";
            String contents = "";


            int i = 0;
            while (i < line.length()) {
                if (line.charAt(i) == '<') {
                    i++;
                    if (line.charAt(i) == '/') {
                         // close tag
                        i++;
                        while (line.charAt(i) != '>') {
                            closeTag += line.charAt(i);
                            i++;
                        }
                    }
                    else {
                        // open tag
                        i++;
                        while (line.charAt(i) != '>') {
                            openTag += line.charAt(i);
                            i++;
                        }
                    }

                }
                if (openTag != "") {
                    contents += line.charAt(i);
                    i++;
                }
                else {
                    i++;
                }

            }


         testCases--;
      }
   }
}