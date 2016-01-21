package thirtyDays;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] e)
    {
        elements = e;
    }



    protected void computeDifference()
    {
        int l = elements.length;
        int tmp = 0;

        for (int i = 0; i < l; i++)
        {
            for (int j = 0; j < l; j++)
            {
                if (elements[i] > elements[j]) tmp = elements[i] - elements[j];
                else tmp = elements[j] - elements[i];
                if (tmp > maximumDifference) maximumDifference = tmp;
            }
        }

    }

}


public class day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }
}