package recursion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

            // base case
            if(head == null || head.next == null)
                return head;

            ListNode newHead = reverseList(head.next);

            head.next.next = head;
            head.next = null;

            return newHead;
    }

    public static ListNode reverseListRecursion(ListNode head){
        return null;
    }

    @Test
    public void test(){

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        reverseList(l1);

        assertEquals(2,l1.val);
    }

}
