package Java.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class JavaStack {


    public Node stack;

    JavaStack(char c, Node node) {
        stack.head = node;
        stack.data = c;
        stack.next = null;
        stack.prev = null;
    }


    public static void main(String []argh)
    {


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arrChar = input.toCharArray();

        Node head = new Node();
        //stack myStack = new JavaStack(arrChar[0], head);


//        for (char a : arrChar) {
//            if (stack.isEmpty()) {
//
//            }
//        }


    }

    public void push(String s) {

    }

    public int pop() {

        return 0;

    }
    public void peek() {

    }

    public boolean isEmpty() {
        return false;
    }

    public void isFull()  {

    }
}
