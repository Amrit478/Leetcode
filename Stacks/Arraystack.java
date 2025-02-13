/*I will put stacks into arrays and than design the stacks with the 
coding with array*/
public class ArrayStack {
  //I will put attribute and constructor here
  private int top;
  private int[] arr;

  public ArrayStack(int capacity) {
    arr = new int[capacity];
    top = -1;
  }
  /*Add new element to the end of the array*/
  public void push(int value) {
    arr[++top] = value;
  }
/*Remove the last element from the array and return its value*/
  public int pop() throws Exception {
    if(top < 0) {
      throws new Exception;
    }
    int value = arr[top];
    top--;
    return value;
  }
  /*Get the top element of the array*/
  public int peek() throws Exception {
    if(top < 0) {
      throws new Exception; 
    }
    return arr[top];
  }
    /*Check if the list is empty or not*/
    public boolean isEmpty() {
      return top < 0;
    }
}
