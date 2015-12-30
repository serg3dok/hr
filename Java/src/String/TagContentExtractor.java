package String;

import java.util.Scanner;

/**
 * Created by sergeyo on 12/28/2015.
 */
public class TagContentExtractor {

        public static void main(String[] args){

            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String line = in.nextLine();

                //Write your code here
                String[] lineArr = line.split("");

                int startTagNum = 0;
                int endTagNum = 0;
                String startTag ="";
                String endTag ="";

                for (int i = 0; i < lineArr.length; i++)
                {

                    if(lineArr[i].equals("<") && !lineArr[i+1].equals("/"))
                    {
                        while(!lineArr[i].equals(">"))
                        {
                            startTag += lineArr[i];
                            i++;
                        }
                        startTagNum = i+2;
                    }

                    if(lineArr[i].equals("<") && lineArr[i+1].equals("/"))
                    {
                        endTagNum = i-1;
                        while(!lineArr[i].equals(">"))
                        {
                            endTag += lineArr[i];
                            i++;

                        }

                    }
                }

                System.out.println(startTag);
                System.out.println(endTag);



                testCases--;
            }
        }

}
