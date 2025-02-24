class Node {
  int data;
  Node left, right;
  Node(int data) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
}
class Data {
  Node node;
  int start;
  int end;
  public Data(Node node, int start, int end) {
    this.node = node;
    this.start = start;
    this.end = end;
  }
}
class main {
  static Node Queuearraytobst (int [] arr) {
    int n = arr.length;

    if(n == 0) 
      return null;

    //create the root node
    int mid = (n - 1) / 2;
    Node root = new Node(arr[mid]);

    Queue<Data> datalink = new LinkedList<>();
    q.add(new Data(root, 0, n - 1));

    while(!datalink.isEmpty()) {
      Data.d = datalink.poll();
    }
    Node curr = d.node;
            int s = d.start, e = d.end;
            int index = s + (e - s) / 2;

            // if left subtree exists
            if (s < index) {
                mid = s + (index - 1 - s) / 2;
                Node left = new Node(arr[mid]);
                curr.left = left;
                q.add(new Data(left, s, index - 1));
            }

            // if right subtree exists
            if (e > index) {
                mid = index + 1 + (e - index - 1) / 2;
                Node right = new Node(arr[mid]);
                curr.right = right;
                q.add(new Data(right, index + 1, e));
  }
}
return root;
 }

    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        Node root = sortedArrayToBST(arr);
        preOrder(root);
    }
}
