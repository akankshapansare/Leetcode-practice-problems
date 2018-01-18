package algorithms;

/**
 * Created by akanksha on 12/15/2017.
 */

public class DeleteDuplicates {

    public static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
        }
    }

    public Node deleteDuplicate(Node head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            Node temp = head;
            Node nextTemp = null;

            while (nextTemp != null) {
                nextTemp = temp.next;
                if (temp.data == nextTemp.data) {
                    if (nextTemp.next != null) {
                        temp.next = nextTemp.next;
                    } else {
                        temp.next = null;
                    }
                } else {
                    temp = temp.next;
                }
            }
            return head;
        }
    }
}
