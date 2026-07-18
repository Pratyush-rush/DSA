/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode pre = temp;
        ListNode end = temp;

        while (true) {

            
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }

            if (end == null)
                break;

            ListNode start = pre.next;
            ListNode next = end.next;

          
            end.next = null;

         
            pre.next = reverse(start);

         
            start.next = next;

      
            pre = start;
            end = pre;
        }

        return temp.next;
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}