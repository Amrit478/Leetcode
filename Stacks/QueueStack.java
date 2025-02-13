  /*I will use two queue to built a stack*/
public class QueueStack {
  Queue<Integer> queue1;
  Queue<Integer> queue2;
  int top = 0;

  //Intalize your data structure here
  public QueueStack() {
    queue1 = newLinkedList<Integer>();
    queue2 = newLinkedList<Integer>();
  }
  /*Push element x onto stack*/
  public void push(int x) {
    queue1.offer(x);
    top = x;
  }
  
  /*Removes the element on top of the stack and return that element*/
  public int pop() {
    while(queue1.size() > 1) {
      top = queue.poll();
      queue2.offer(top);
    }
    int res = queue1.poll();
    Queue<Integer> temp = queue1;
    queue1 = queue2;
    queue2 = temp;
    return res;
  }

/*Get the top element*/
public int top() {
  return top;
}
/*Return the stack is empty or not*/
public boolean isEmpty() {
  return queue1.isEmpty();
}
}

