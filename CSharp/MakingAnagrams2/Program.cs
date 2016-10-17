using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MakingAnagrams2
{
    class Program
    {
        /*

        cde
        abc

        sum = a + b = 6
        matches = 1
        result = sum - 1 * 2 = 4

        */

        static void Main(String[] args)
        {
            string a = Console.ReadLine();
            string b = Console.ReadLine();
            Console.WriteLine(makingAnagrams(a, b));
            Console.ReadKey();
        }

        public static int makingAnagrams(string a, string b)
        {
            int sum = a.Length + b.Length;
            int matches = 0;

            char[] aChars = a.ToCharArray(); // a to array
            char[] bChars = b.ToCharArray(); // b to array

            Array.Sort(aChars); // sort a array
            Array.Sort(bChars); // sort b array

            int i = 0; // pointer for a
            int j = 0; // pointer for b

            while (i < a.Length)
            {
                if (aChars[i] == bChars[j])
                {
                    matches++;
                    i++;
                    j++;
                }
                if (aChars[i] < bChars[j])
                {
                    i++;
                }
                else
                {
                    j++;
                }
                if (i == a.Length || j == b.Length) break; 
            }



            return sum - matches * 2;
        }
    }
}
