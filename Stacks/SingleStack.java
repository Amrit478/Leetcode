//Studied from this link https://cs.lmu.edu/~ray/notes/stacks/

public class LinkedStack implements Stack {
  private record Node(Object node, Node next)
}
private Node top = null;
private int size = 0;

//I have to write a method for push
public void push(Object item) {
  if(head == null) {
  Node.head = item;
  size++;
  }
else {
  //Place head first and than add size to the list
  top = new Node(item, top);
  size++;
}
}

//I have to write a method for pop
public Object pop() {
  //I have to remove the top element from the stack and do not return it and edgecase is if it empty than return null
  if(head == null) {
    System.out.println("The stack is empty");
  }
  else {
    var item = peek();
    top = top.next;
    size--;
    return item;
  }
}

//I have to write a method for isEmpty
public boolean isEmpty() {
  if(head == null) {
    return true;
  }
  else {
    return false;
  }
}

//I have to write a method for peek
public void peek() {
  //In this I will return head of the function without deleting the function and if it is empty than I will return It does not exist
  if(head == null) {
    System.out.println("The Linked list is empty");
  }
  else {
    return top.data;
  }
}

//I have to write a method for size
public int size() {
  return size;
}
}
