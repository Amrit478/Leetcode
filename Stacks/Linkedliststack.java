/*I will add Linked list with Stacks which I will provide from the details this class so I know how to implement stacks with linked lists. This one will be implement using Singly linked list*/
public class ListNode{
  //Attributes are written here
  public int val;
  public ListNode head;
  //Constructor will be written here
  public ListNode(int val) {
    this.val = val;
    this.head = null;
  }
}
/*Now I will be creating stacks using the above class */

public class Linkedliststack {
  private ListNode head;
  //Constructor here 
  public Linkedliststack() {
  head = null;
}
//These are methods which I will writing in this class
/*Add item to the list, let head point to the new node */

public void push(int value) {
  ListNode oldHead = head;
  head = new ListNode(value);
  head.next = oldHead;
}
  /*Remove the head item to the list, and return its value */
  public int pop() throws Exception {
    if(head == null) {
      throws new Exception();
    }
    int value = head.val;
    head = head.next;
    return value;
  }
    /*Get the value of the head item */

  public int peek() throws Exception {
    if(head == null) {
      throw new Exception;
    }
    return head.val;
  }
    /*Whether the list is empty or not */
  public boolean isEmpty() {
    return head == null;
  }
}







