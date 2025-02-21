public class Stackqueue {
  private Stack<Integer> stack1;
  private Stack<Integer> stack2;

public Stackqueue() {
  stack1 = new Stack<>();
  stack2 = new Stack<>();
}
  //Add new item to the queue
  public void enqueue(int value) {
    stack1.push(value);
  }
  //Remove the first item from the queue and return its value
  public int dequeue() throw Exception {
    peek();
    return stack2.pop();
  }
  
  //Get the first element
  public int peek() throws Exception {
    if(stack2.isEmpty()) {
      while(!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }
    if(stack2.isEmpty()) {
      throw new Exception();
    }
    return stack2.peek();
  }
  
  //Return whether the queue is empty
public boolean isEmpty() {
  return stack1.isEmpty() && stack2.isEmpty();
}
