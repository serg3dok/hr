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
            int t = Console.Read();
            int[] result = new int[2];

            for (int i = 0; i < t; i++)
            {
                int[,] points = new int[2,2];
                for (int j = 0; j < 2; j++)
                {
                    for (int k = 0; k < 2; k++)
                    {
                        points[j,k] = Console.Read();
                    }
                }

                // Calculate x
                if (points[0,0] < points[1,0])
                {
                    result[0] = points[0,0] + points[1,0]; 
                }
                else
                {
                    result[0] = points[0,0] - points[1,0]; 
                }

                // Calculate y
                if (points[0,0] < points[0,1])
                {
                    result[1] = points[0,0] + points[0,1];
                }
                else
                {
                    result[1] = points[0,0] - points[0,1];
                }
                
                Console.WriteLine(result[0] + " " + result[1]);

            }

            

        }
    }
}
