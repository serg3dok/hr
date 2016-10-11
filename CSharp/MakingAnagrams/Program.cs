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
            string str1 = "dn";
            string str2 = "n";
            // 1

            int result = anagram(str1, str2);
            Console.WriteLine(result);
            Console.ReadKey();

        }

        public static int anagram(string str1, string str2)
        {
            if (str1.Equals(str2)) return 0;

            int matches = 0;

            if (str1.Length >= str2.Length)
            {
                for (int i = 0; i < str2.Length; i++)
                {
                    if (str1.Contains(str2[i]))
                    {
                        str1.Remove(str1.IndexOf(str2[i]));
                        matches++;
                    }
                    
                }
            }
            else
            {
                for (int i = 0; i < str1.Length; i++)
                {
                    if (str2.Contains(str1[i]))
                    {
                        str2.Remove(str2.IndexOf(str1[i]));
                        matches++;
                    }
                }
            }
            
            
            return (str1.Length + str2.Length) - matches * 2;
        }
    }
}
