/*Reverse the doubly linked list and I will do it using recursion
Input: Doubly Linked List = 1 <-> 2 <-> 3 -> NULL */

/*SOLUTION 
I THINK I CAN START FROM PRINTING FROM TAIL AND COME BACK TO HEAD WHEN PRINTING IS DONE THAN I WILL RETURN HEAD. 
however, You want a recursive function that swaps next and prev pointers and returns the new head (which was the tail of the original list).*/

class Node {
  int data;
  Node next;
  Node previous;
  Node(int data) {
    this.data = data;
    this.next = null;
    this.previous = null;
  }
}
/*RECURSION WITH STEPS TO FOLLOW -
I WILL FOLLOW TAIL RECURSION AND I WILL USE NEXT AND PREVIOUS POINTER TO MAKE CHANGES IN THE HEAD SO I WILL FINISH MY DOUBLY LINKED LIST TRAVERSAL*/

 // Recursive function to reverse a doubly linked list
    static Node reverse(Node curr) {
      //Define my base case here
      if(curr == null) {
      return;
      }
//Getting the tail from linked list
        Node temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;

        // If prev is null after swap, this is the new head
        if (curr.prev == null) {
            return curr;
        }

        // Recurse for the next node
        return reverse(curr.prev);
    }

   static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

 public static void main(String[] args) {
      
        // Manually create a doubly linked list:
        // 1 <-> 2 <-> 3 <-> 4
        head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original linked list:");
        printList(head);

        // Reverse the doubly linked list
        head = reverse(head);

        System.out.println("Reversed linked list:");
        printList(head);
    }
}

