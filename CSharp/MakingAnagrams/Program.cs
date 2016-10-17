using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace MakingAnagrams
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
               i
            fsqoaidfaukvngpsugszsnseskicpejjvytviya
            kmgsxamduovigbasjchnoskolfwjhgetnmnkmcphmpwnrrwtymjtwxget
            100
            40



            */

            string str1 = "fsqoiaidfaukvngpsugszsnseskicpejjvytviya";
            string str2 = "ksmfgsxamduovigbasjchnoskolfwjhgetnmnkmcphqmpwnrrwtymjtwxget";
            // 42

            int result = anagram(str1, str2);
            Console.WriteLine(result);
            Console.ReadKey();

        }

        public static int anagram(string str1, string str2)
        {
            if (str1.Equals(str2)) return 0;

            
            //int matches = 0;
            int length = str1.Length + str2.Length;
            Console.WriteLine("length: " + length);

            


            if (str1.Length >= str2.Length)
            {
                string bigger = str1;

                for (int i = 0; i < str2.Length; i++)
                {
                    if (bigger.Contains(str2[i]))
                    {
                        
                        bigger.Remove(str1.IndexOf(str2[i]));
                        length = length - 2;
                    }
                }
            }
            else
            {
                string bigger = str2;
                for (int i = 0; i < str1.Length; i++)
                {
                    if (bigger.Contains(str1[i]))
                    {
                        Console.WriteLine("str1[" + i + "] = " + str1[i]);
                        Console.WriteLine("str2[" + str2.IndexOf(str1[i]) + "] = " + str2[str2.IndexOf(str1[i])]);
                        Console.WriteLine(bigger);
                        //bigger.Remove(str2.IndexOf(str1[i]));
                        bigger.Replace(str1[i].ToString(), "0");
                        Console.WriteLine(bigger);
                        length = length - 2;
                        Console.WriteLine("length = " + length);
                        Console.WriteLine();
                    }
                }
            }
            
            
            return length;
        }
    }
}
