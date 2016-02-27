using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices.ComTypes;
using System.Text;
using System.Threading.Tasks;

namespace FindPoint
{
    class Program
    {
        static void Main(string[] args)
        {
            int t = Convert.ToInt32(Console.ReadLine());

            for (int i = 0; i < t; i++)
            {
                string[] numbersInput = Console.ReadLine().Split(' ');
                int l = numbersInput.Length;
                int[] points = new int[4];
                points = Array.ConvertAll(numbersInput, Int32.Parse);
                int[] result = new int[2];



                // Calculate x
                if (points[0] < points[2])
                {
                    if (points[0] > 0)
                    {
                        result[0] = points[2] + (points[2] - points[0]);
                    }
                    else
                    {
                        result[0] = points[2] + (points[2] + (points[2]-(-points[0])));
                    }
                    
                }
                else
                {
                    result[0] = points[2] - (points[2] + points[0]);
                }

                // Calculate y
                if (points[1] < points[3])
                {
                    result[1] = points[3] + (points[3] - points[1]);
                }
                else
                {
                    result[1] = points[3] - (points[3] + points[1]);
                }

                Console.WriteLine(result[0] + " " + result[1]);
            }
        }
    }
}

