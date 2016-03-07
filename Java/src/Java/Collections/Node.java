package Java.Collections;

import java.util.Objects;

/**
 * Created by sergeyo on 3/4/2016.
 */
public class Node {
    Node head;
    Node next;
    Node prev;
    Object data;

    //Constructor
    public Node (Object dataValue, Node head) {
        data = dataValue;
        next = null;
        prev = null;
        this.head = head;
    }

    public Node() { }


    // return data
    public Object getData() { return data; }

    // next Node
    public Node getNext() { return next; }

    // check if it is empty
    public boolean isEmpty(Node head) { return (head == null); }

    // set data
    public void setData(Object dataValue) { data = dataValue; }

    // add Node
    public void addNode(Object dataValue, Node current) {
        if (current == null) {
            current = new Node(dataValue, current);
        }
        else {
            current = current.next;
            setData(dataValue);
        }
    }
}
