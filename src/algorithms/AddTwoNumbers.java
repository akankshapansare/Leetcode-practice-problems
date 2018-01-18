package algorithms;

/**
 * Created by akanksha on 1/16/2018.
 */
public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;
        int x;
        int y;
        int sum;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                x = l1.val;
            } else {
                x = 0;
            }

            if (l2 != null) {
                y = l2.val;
            } else {
                y = 0;
            }
            sum = x + y + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return result.next;

    }
}