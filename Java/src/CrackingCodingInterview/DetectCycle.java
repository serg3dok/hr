package CrackingCodingInterview;

public class DetectCycle {
    public static void main(String[] args) {

        Node linkedList = new Node(1);
        Node head = linkedList;
        for (int i = 0; i < 25; i++) {
            linkedList.next = new Node(i);
            linkedList = linkedList.next;
        }
        //linkedList.next = head.next.next;


        System.out.println(hasCycle(head));
    }


    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) return false;

        Node slow = head;
        Node slow2 =head;
        Node fast = head.next;
        while (fast.next != null) {
            if (slow == fast) {
                return true;
            }
            else {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    }
}


