public class LinkedListQueue{
  private ListNode head;
  private ListNode tail;
    public LinkedListQueue() {
      head = null;
      tail = null; 
    }
  //Add item to the tail of the list
public void enqueue(int value) {
  if(tail == null) {
  tail = new ListNode(value);
  head = tail
    }
else {
  tail.next = new ListNode(value);
  tail = tail.next;
}
  }

  //Remove the head from the list and return its value
public int dequeue() throws Exception {
  if(tail == null) {
    throws new Exception();
  }
  int value = head.val;
  head = head.next;
   if(head == null) {
     tail = null;
   }
  return value;
}

  //Get the value of the head
public int peek() throws Exception{
  if(head == null) {
  throws new Exception;
}
  return head.val;
}
  //Return whether the queue is empty
public boolean isEmpty() {
  return head == null;
}
}
