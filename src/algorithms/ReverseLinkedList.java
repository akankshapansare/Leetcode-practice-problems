package algorithms;

import java.util.Stack;

/**
 * Created by akanksha on 2/13/2018.
 */
public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        Stack<Integer> stack = new Stack<>();
        ListNode tempNode = head;
        while (tempNode.next != null) {
            stack.push(tempNode.val);
            tempNode = tempNode.next;
        }
        head = tempNode;
        int currentStackValue;
        while (!stack.isEmpty()) {
            currentStackValue = stack.pop();
            tempNode.next = new ListNode(currentStackValue);
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        return head;
    }
}
