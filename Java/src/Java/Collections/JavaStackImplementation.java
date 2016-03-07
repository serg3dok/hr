package Java.Collections;
import java.util.*;
class JavaStackImplementation{



    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {


            String input = sc.nextLine();
            char[] arrOfChars = input.toCharArray();

            Stack stackOfChars = new Stack(arrOfChars.length);

            int i = 0;
            while (!stackOfChars.isFull()) {
                stackOfChars.push(arrOfChars[i++]);
            }

            int resA = 0;
            int resB = 0;
            int resC = 0;
            while (!stackOfChars.isEmpty()) {
                char retChar = stackOfChars.pop();
                switch (retChar) {
                    case '(':
                        resA++;
                        break;
                    case ')':
                        resA--;
                        break;
                    case '[':
                        resB++;
                        break;
                    case ']':
                        resB--;
                        break;
                    case '{':
                        resC++;
                        break;
                    case '}':
                        resC--;
                        break;
                }

                int result = resA + resB + resC;
                System.out.println(result == 0);
            }

        }
    }

}

class Stack {
    private int top;
    private char[] stackArray;
    private int maxSize;

    Stack(int size) {
        top = -1;
        stackArray = new char[size - 1];
    }

    public void push(char c) {
        stackArray[++top] = c;
    }

    public char pop () {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
