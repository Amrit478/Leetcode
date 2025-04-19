/*Given a linked list, the task is to reverse the linked list by changing the links between nodes.
Examples: 
Input: head: 1 -> 2 -> 3 -> 4 -> NULL
Output: head: 4 -> 3 -> 2 -> 1 -> NULL
Explanation: Reversed Linked List:
Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
Output: head: 5 -> 4 -> 3 -> 2 -> 1 -> NULL*/

//Node class will be here
class Node {
  int data;
  Node next;
Node(int data) {
  this.data = data;
  this.next = null;
}
}

/*We will reverse using Stacks for the Iteration*/
public


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

  /*We will also reverse using the recursion*/



