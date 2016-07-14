package DataStructures;

/**
 * Created by Sergey on 3/30/2016.
 */
public class Stack {
    static int[] stack;
    static int n;
    int size;

    Stack() {
        size = 10;
        stack = new int[size];
        n = -1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Stack.push(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Stack.pop());
        }
    }

    public static void push(int x) { stack[--n] = x;
        System.out.println("Push - n = " + n + "; x = " + x);}
    public static int pop() {
        return stack[n--];
    }
}
