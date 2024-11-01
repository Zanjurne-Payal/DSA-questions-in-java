package Linked_list;

public class find_length_of_linked_list {
    public static int find_length_recursion(Node head , int length){
        if(head == null)return 0;
        return find_length_recursion(head.next, length)+1;
    }
    public static int find_length(Node head){
        int length = 0;
        while(head != null)
        {
            head = head.next;
            length++;
        }
        return length;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println("Length of linked list is "+find_length(a));
        System.out.println("Length of linked list is using recursion "+find_length_recursion(a,0));
    }
}
