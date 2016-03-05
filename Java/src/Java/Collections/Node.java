package Java.Collections;

/**
 * Created by sergeyo on 3/4/2016.
 */
public class Node extends java.util.ArrayList<String> {
    Node next;
    Node prev;
    Object data;

    //Constructor
    Node (Object dataValue) {
        data = dataValue;
        next = null;
        prev = null;
    }

    // return data
    public Object getData() { return data; }

    // next Node
    public Node getNext() { return next; }

    // check if it is empty
    public boolean isEmpty(Node head) { return (head == null); }

    // set data
    public void setData(Object dataValue) { data = dataValue; }


}
