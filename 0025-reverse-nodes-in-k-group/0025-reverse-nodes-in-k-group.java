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

    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode prev = dummy;

    while (true) {

        // Find kth node
        ListNode kth = prev;

        for (int i = 0; i < k; i++) {
            kth = kth.next;

            if (kth == null) {
                return dummy.next;
            }
        }

        // Store next group
        ListNode nextGroup = kth.next;

        // Reverse current group
        ListNode current = prev.next;
        ListNode previous = nextGroup;

        while (current != nextGroup) {

            ListNode next = current.next;

            current.next = previous;
            previous = current;
            current = next;
        }

        // Connect previous group to reversed group
        ListNode oldStart = prev.next;

        prev.next = kth;
        prev = oldStart;
    }
}
}