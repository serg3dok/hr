/**
 * Created by Sergey on 12/4/2015.
 */
public class Stack {

    static int[] arr;
    static int level;
    static int arrSize;

    public static void main(String[] args)
    {
        arr = new int[10];
        arrSize = 10;
        level = 0;

        for (int i = 0; i < arrSize; i++)
        {
            addNewNum(i);
        }

        for (int i = 0; i < arrSize; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    protected static void addNewNum(int n)
    {
        int i = level;
        if (level == 0)
        {
            arr[0] = n;
        }
        else
        {
            while(i > 0)
            {
                arr[i] = arr[i-1];
                i--;
            }
            arr[0] = n;
        }
        level++;
    }
}
