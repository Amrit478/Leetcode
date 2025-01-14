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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Placeholder node to simplify code
        ListNode current = dummyHead; // Pointer to construct the result list
        int carry = 0; // To hold carry between sums of digits

        // Iterate through both linked lists until both are null
        while (l1 != null || l2 != null) {
            // Get values of current nodes or 0 if the list is exhausted
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Compute sum and carry
            int sum = x + y + carry;
            carry = sum / 10;

            // Create a new node for the current digit
            current.next = new ListNode(sum % 10);

            // Move pointers forward
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's a carry left after processing all digits, add a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the resulting list, skipping the dummy head
        return dummyHead.next;
    }
}