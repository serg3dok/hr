using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//Akash and Akhil are playing a game.They have balls numbered from to.Akhil asks Akash to reverse the position of the balls, i.e., to change the order from say, 0,1,2,3 to 3,2,1,0. He further asks Akash to reverse the position of the balls times, each time starting from one position further to the right, till he reaches the last ball. So, Akash has to reverse the positions of the ball starting from position, then from position, then from position and so on. At the end of the game, Akhil will ask Akash the final position of any ball numbered.Akash will win the game, if he can answer.Help Akash.

namespace ReverseGame
{
    class Program
    {

        static void Main(string[] args)
        {
            int t = readNumber();

            for (int i = 0; i < t; i++) 
            {
                string line = Console.ReadLine();
                int a = int.MinValue;
                int b = int.MinValue;
                try
                {
                    a = Convert.ToInt32(line.Split(' ')[0]);
                    b = Convert.ToInt32(line.Split(' ')[1]);
                }
                catch (FormatException){} 


                int[] arr = new int[a];

                //add values to arr
                for (int j = 0; j < a; j++)
                {
                    arr[j] = j;
                }


                #region Solution 1
                //for (int j = 0; j < a; j++)
                //{
                //    for (int k = j; k < j + (a - j) / 2; k++)
                //    {
                //        int tmp = arr[k];
                //        arr[k] = arr[a - k - 1];
                //        arr[a - k - 1] = tmp;
                //    }
                //} 
                #endregion

                arr = smartReplacer(arr);


                for (int j = 0; j < a; j++)
                {
                    if (arr[j] == b)
                    {
                        Console.WriteLine(j);
                    }
                }

            }
            Console.ReadLine();
        }


        static int readNumber()
        {
            int result = Int32.MinValue;
            bool valid = false;
            while (!valid)
            {
                //Console.Write(message + ": ");
                string input = Console.ReadLine();
                valid = Int32.TryParse(input, out result);
                if (result < 0) valid = false;
            }
            return result;
        }

        static int[] smartReplacer(int[] arr)
        {
            //int arrLength = arr.Length;
            int fi = 0; // forward iterator
            int bi = arr.Length - 1; // backward iterator
            int[] result = new int[arr.Length]; 
            while (fi != arr.Length / 2)
            {
                result[fi] = arr[bi];
                //fi++;
                result[fi] = arr[fi];
                bi--;
            }
            
            return result;
        }




    }
}
