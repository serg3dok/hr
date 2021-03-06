package CrackingCodingInterview;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Sergey on 10/20/2016.
 *

 0  1  2  3  4  5
 5  4  3  2  1  0


 42
 de
 14
 pr
 28 14


 10
 1 42
 2
 1 14
 3
 1 28
 3
 1 60
 1 78
 2
 2

 */

public class TaleOfTwoStacks {
    public static class MyQueue<T> {

        public Stack<T> stackNewestOnTop = new Stack<T>();
        public Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);
        }

        public T peek() {

            if (stackOldestOnTop.isEmpty() && !stackNewestOnTop.isEmpty()) {
                reverseStack();
            }
            return stackOldestOnTop.peek();
        }

        public T dequeue() {
            if (stackOldestOnTop.isEmpty() && !stackNewestOnTop.isEmpty()) {
                reverseStack();
            }
            return stackOldestOnTop.pop();
        }


        public void reverseStack(){
            if (!stackNewestOnTop.isEmpty() && stackOldestOnTop.isEmpty()) {
                while (!stackNewestOnTop.isEmpty()) {
                    //T tmp = stackNewestOnTop.pop();
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }
    }


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
