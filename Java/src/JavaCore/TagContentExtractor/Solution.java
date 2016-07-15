package JavaCore.TagContentExtractor;

/**
 * Created by Sergey on 7/2/2016.
 */

        import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            String openTag = "";
            String closeTag = "";
            String content = "";


            int i = 0; //char iterator

            while (i < line.length()) {
                if (line.charAt(i) == '<') {
                    i++;
                    //System.out.println(line.charAt(i));
                    if (line.charAt(i) == '/') {
                        // close tag
                        i++;
                        //System.out.println(line.charAt(i));
                        while (line.charAt(i) != '>') {
                            closeTag += line.charAt(i);
                            i++;
                            //System.out.println(line.charAt(i));
                        }
                        // iterate i if line continues
                        if(line.length()-1 != i) {
                            i++;
                            //System.out.println(line.charAt(i));
                        }
                    }
                    // if no '/'
                    else {
                        // reset openTag
                        if (openTag != "") {
                            openTag = "";
                        }
                        // open tag
                        //i++;
                        while (line.charAt(i) != '>') {
                            openTag += line.charAt(i);
                            i++;
                            //System.out.println(line.charAt(i));
                        }
                        i++;
                        //System.out.println(line.charAt(i));
                    }
                }

                if (openTag != "") {
                    // if second openTag  remove previous openTag and content
                    if (line.charAt(i) == '<' && line.charAt(i+1) != '/') {
                        content = "";
                        openTag = "";
                    }

                    else {
                        if (line.charAt(i) != '<' || line.charAt(i) != '>') {
                            content += line.charAt(i);
                            i++;
                            //System.out.println(line.charAt(i));
                        }
                        //i++;

                    }
                }
                else {
                    i++;
                    //System.out.println(line.charAt(i));
                }
                if (closeTag.equals(openTag) && content != "") {

                    System.out.println(content);
                    closeTag = "";
                    openTag = "";
                    content = "";
                }
            }
            if (content == "") System.out.println("None");
            testCases--;
        }
    }


}

