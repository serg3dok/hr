
using System;
using System.Collections.Generic;
using System.Globalization;
using System.IO;
class Solution
{
    static void Main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        int diag1 = 0;
        int diag2 = 0;
        int t = Convert.ToInt32(Console.ReadLine());  //testcases
        int d2 = t-1;
        for (int i = 0; i < t; i++)
        {
            for (int j = 0; j < t; j++)
            {
                int number = Convert.ToInt32(Console.ReadLine());
                
                if (i == j)
                {
                    diag1 += number;
                }

                if (d2 == j)
                {
                    diag2 += number;
                    d2--;
                }
            }
        }
        int result = diag1 > diag2 ? diag1 - diag2 : diag2 - diag1;
        Console.WriteLine(result.ToString(CultureInfo.InvariantCulture));
        Console.ReadLine();
    }
}