public class Linkedwork {
  //Create a doubly Linked List with the given array 
  /*The method willl be given here and I will be declaring linked list here and than I will be using that method
  For any problems we will get We have declare like hashmap queue or stack in the problem and than we will be solving problem with it for leetcode*/

  public static DoubleNode Create(int [] arr) {
    if(arr == null || arr.length == 0){
      return null;
    }

    //Declaring the Linked List node here
    DoublyLinkedNode dummy == new DoublyLinkedNode(0);
    DoublyLinkedNode currnode = dummy;

    //I will be using loops to putting this array into the linked list
    for(int i = 0; i < arr.length; i++) {
      curr.next = newDoubleyLinkedNode (arr[i]) {
        curr.next.previous = curr;
        curr = curr.next;
      }

      return dummy.next;

    }
  }
        
