using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace AngryProfessor
{

    public class Program

    {
        private static String[] _arrYesNo = {};
        private static int _index = 0;

        public static void Main(string[] args)
        {
            var numberOfTestCases = Int32.Parse(Console.ReadLine());
            _arrYesNo = new string[numberOfTestCases];


            for (int i = 0; i < numberOfTestCases; i++)
            {
                if (TestCase())
                {
                    _arrYesNo[_index] = "NO";
                }
                else
                {
                    _arrYesNo[_index] = "YES";
                }
                _index++;
            }

            for (int i = 0; i < numberOfTestCases; i++)
            {
                Console.WriteLine(_arrYesNo[i]);
            }
            Console.ReadLine();
        }

        private static bool TestCase()
        {
            string[] secondLine = Console.ReadLine().Split(Convert.ToChar(" "));
            int students = Int32.Parse(secondLine[0]);
            int cancelation = Int32.Parse(secondLine[1]);

            string[] thirdLine = Console.ReadLine().Split(Convert.ToChar(" "));
            int arrived = 0;
            for (int i = 0; i < students; i++)
            {
                if (Int32.Parse(thirdLine[i]) < 1)
                    arrived++;
            }

            int badStudents= students - arrived;
            //Console.WriteLine("badStudents: " + badStudents);

            if (arrived >= cancelation)
            {
                return true;
            }
            return false;
        }

    }
}