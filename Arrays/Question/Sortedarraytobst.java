//I am going to use Recursion
Class Node {
  int data;
  Node left;
  Node right;
public Node(int data) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
}
//This will be method which will be working for here
class main {
  static Node sortedarraytobst(int [] arr, int start, int end) {
    if(start > end) {
      return null;
    }
    //Find the middle element
    int mid = (int start + int end) / 2;
    Node root = new Node(arr[mid]);

    //Create left subtree
  root.left = sortedarraytobst(arr, start, mid-1);
    
      //Create right subtree
  root.right = sortedarraytobst(arr, end, mid + 1);
  }
  static Node sortedArrayToBST(int[] arr) {
        return sortedArrayToBSTRecur(arr, 0, arr.length - 1);
    }
    static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node root = sortedArrayToBST(arr);
        preOrder(root);
  }
}
