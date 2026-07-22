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

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null)
            return true;

        ListNode slw = head;
        ListNode fst = head;

        while (fst != null && fst.next != null) {
            slw = slw.next;
            fst = fst.next.next;
        }

        ListNode prev = null;
        while (slw != null) {
            ListNode next = slw.next;
            slw.next = prev;
            prev = slw;
            slw = next;
        }

        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            if (first.val != second.val)
                return false;

            first = first.next;
            second = second.next;
        }

        return true;
    }
}