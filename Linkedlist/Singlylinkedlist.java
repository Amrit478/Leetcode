package Linkedlist;

//https://www.simplilearn.com/tutorials/data-structure-tutorial/types-of-linked-list#what_is_a_doubly_linked_list

public class Singlylinkedlist extends Node{
    public static void main(String[] args) {
        
    }
}
//This is my generic class which can accept any data type including arrays of int, double or strings
class Node<T>{
    T data;
    private Node next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}

//Rigid class which can accept only certain data types
/*class Node{
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
} */