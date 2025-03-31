class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode dummy = res;
        for(int i=0;i<n;i++) head = head.next;
        while(head!=null){
            head = head.next;
            dummy = dummy.next;
        }
        dummy.next = dummy.next.next;
        return res.next;
    }
}
    /*I have to use linked list with two pointer and I will do it as follows
    ALGORITHM
   1. INTILIZE A POINTER TO HEAD WHICH WILL BE CALLED CURRENT.
   2. INTILIZE A POINTER TO PREVIOUS TO AN EMPTY.
   
   COVERING MY EDGE CASE HERE

   3. WHILE CURRENT IS NOT NONE
    a. If `current.value` is equal to `value_to_remove`:
        i. If `previous` is None:  // This means we are at the head
            - Set `head` to `current.next`  // Update head to the next node
        ii. Else:
            - Set `previous.next` to `current.next`  // Bypass the current node
        iii. Return head  // Return the modified list
    b. Set `previous` to `current`.
    c. Move `current` to `current.next`.
4. Return head  // Return the head of the modified list (unchanged if value not found)
     */    
    