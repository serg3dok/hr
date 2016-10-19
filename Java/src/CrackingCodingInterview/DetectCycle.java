package CrackingCodingInterview;

public class DetectCycle {
    public static void main(String[] args) {

        Node linkedList = new Node(1);
        Node head = linkedList;
        for (int i = 0; i < 25; i++) {
            linkedList.next = new Node(i);
            linkedList = linkedList.next;
        }
        linkedList.next = head.next.next;

        hasCycle(head);
    }


    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (head != null) {
            if (slow.data == fast.data) {

            }

        }
        return false;
    }
}


