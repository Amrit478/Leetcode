/*Given a linked list, the task is to reverse the linked list by changing the links between nodes.
Examples: 
Input: head: 1 -> 2 -> 3 -> 4 -> NULL
Output: head: 4 -> 3 -> 2 -> 1 -> NULL
Explanation: Reversed Linked List:
Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
Output: head: 5 -> 4 -> 3 -> 2 -> 1 -> NULL*/
  /*We will also reverse using the recursion*/

//Node class will be here
class Node {
  int data;
  Node next;
Node(int data) {
  this.data = data;
  this.next = null;
}
}

/*We will reverse using Stacks for the Iteration because when we use stacks than the first thing is going this linked list into stack which will go first and when we pop the stack than
it will come out last in out first which makes it reversing the linked list quicker
WE ARE USING THE LIFO WHICH IS BASED ON STACKS*/
class GfG {
  	
// Function to reverse the linked list and than store into stacks and than pushing Node into stacks
  static Node reverselist(Node node);

Stack<Integer> amrit = new Stack<>();
  Node current = head;
    while(current != null) {
      amrit.push(current);
      current = current.next;
  }

//This function will make the head the current node 
if(!stack.isEmpty()) {
  head = stack.pop();
  current = head;
}

//Pop each function of the stack and return the reversal of the linked list
while(!stack.isEmpty()) {
  //I am using current.next here because I have already given head current here
  current.next = current.pop();
  current = current.next;
}
return head;


  // This function prints the contents 
    // of the linked list starting from the head
    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
      	
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked List:");
        printList(head);

        head = reverseList(head);

        System.out.print("\nReversed Linked List:");
        printList(head);
    }
}





