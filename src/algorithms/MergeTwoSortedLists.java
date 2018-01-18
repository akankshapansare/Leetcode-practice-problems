package algorithms;

import java.util.ArrayList;

/**
 * Created by akanksha on 12/18/2017.
 */
public class MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            this.val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(-1);
        ListNode prev = output;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;

        return output.next;
    }
}
