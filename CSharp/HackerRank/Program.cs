using System;
using System.Collections.Generic;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;


namespace HackerRank
{
    class Program
    {
        public static BigInteger Result;

        //public static long Result;

        static void Main(string[] args)
        {
            BigInteger input = BigInteger.Parse(Console.In.ReadLine()); 
            Console.Out.WriteLine(Calculate(25));
            String x = Console.In.ReadLine();
        }

        static BigInteger Calculate(BigInteger number)
        {
            if (number <= 1)
            {
                return 1;
            }
            else
            {
                Result = number*(Calculate(number - 1));
                return Result;
            }
        }
    }


}
