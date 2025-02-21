public class ArraysQueue {
  private int head;
  private int tail;
  private int[] arr;
  public ArraysQueue(int capacity) {
    arr = new int[capacity];
    head = -1;
    tail = -1;
  }

   //Add item to the end of the array
public void enqueue(int value) {
if(tail >= arr.length - 1) {
  return;
}
  arr[tail++] = value;
  if(head == -1) {
    head = 0;
  }
   //Remove the first item from the array and return its value
public int dequeue() throws Exception {
  if(head == null) {
  throw new Exception();
  }
  int value = arr[head];
  head++;
  return value;
}
   //Get the first item
public int peek() throws Exception {
  if(isEmpty) {
    throws new Exception;
  }
  return arr[head];
}
   //Return whether the queue is empty or not
public boolean isEmpty() {
  return (head = -1) || (head > tail);
}
}
