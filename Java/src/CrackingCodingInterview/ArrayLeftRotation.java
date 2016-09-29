package CrackingCodingInterview;

/**
 * Created by Sergey on 9/28/2016.
 */
public class ArrayLeftRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        leftRotation(array, 5);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    // 1 2 3 4 5 6 7 8 9   -> 6 7 8 9 1 2 3 4 5
    //
    //   i       s  j
    // 6 7 3 4 5 8 9 1 2
    // tmp=2

    public static int[] leftRotation(int[] array, int rotations) {
        int l = array.length;
        for (int i = 0; i < rotations; i++) {
            int tmp = array[i];
            array[i] = array[rotations];
            for (int j = rotations ; j < l-1; j++) {
                array[j] = array[j+1];
            }
            array[l-1] = tmp;
        }
        return array;
    }
}
