using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayLeftRotation
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            int[] rotated = rotateArray(numbers, 9, 6); //pass array, size of array, number of rotations

            foreach (var number in rotated)
            {
                Console.Write(number + " ");
            }

            Console.ReadKey();

        }

        // 1 2 3 4 5 6 7 8 9

        //         i static
        //         V V  <-     pointers
        // 6 7 8 9 1 2 3 4 5   tmp=5
        // i iteration 1 1 1 1 1 - number of rotations
        // j iteration 3 3 3 3 3



        public static int[] rotateArray(int[] numbers, int size, int rotations)
        {
            for (int i = 0; i < rotations; i++)
            {
                int tmp = numbers[i];
                numbers[i] = numbers[rotations];
                Console.Write("i ");
                for (int j = rotations; j < size-1; j++)
                {
                    numbers[j] = numbers[j + 1];
                    Console.Write("j ");
                }
                numbers[size - 1] = tmp;
            }


            return numbers;
        }
    }
}
