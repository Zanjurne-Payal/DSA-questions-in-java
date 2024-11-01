//limitations of array
//1 continues memory allocation
//array needs less time complexity to access the data which is at any location
//2 . difficult to insert element at middle of given array
//3.arrays every index address in sequence


//is linked list overcome the arrays limitations?  yes
//linked lists every nodes address is not in sequence . it is memory efficient
// it requires double memory because it stores data and next nodes address.
// it is useful when we want to add element at any position
// when we want to get any value it needs O(n) that is limitation.

// types of linked list = 1. Singly linked list     2. Doubly linked list      3. Circular linked list

package Linked_list;

public class basics {
    public static class Node{
        int data;       //value
        Node next;      //Address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void insert_at_end(Node head,int data){
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.data = data;
    }
    public static void print_reverse(Node temp){
        if(temp == null)return;
        print_reverse(temp.next);
        System.out.print(temp.data+"    ");
    }
    //recursive function
    public static void print(Node temp){
        if(temp == null)return;
        System.out.print(temp.data+"    ");
        print(temp.next);

    }

    //normal function
//    public static void print(Node head){
//        Node temp = head;
//        while(temp != null)
//        {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(15);
        Node c = new Node(25);
        Node d = new Node(35);
        Node e = new Node(45);
        //we want that type of list
        // 5  15  25  35  45
        a.next = b;     // 5 -> 15  25  35  45
        b.next = c;     // 5 -> 15 -> 25  35  45
        c.next = d;     // 5 -> 15 -> 25 -> 35  45
        d.next = e;     // 5 -> 15 -> 25 -> 35 -> 45

//        System.out.println(b);  //Linked_list.basics$Node@6acbcfc0
//        System.out.println(a.next);     //Linked_list.basics$Node@6acbcfc0
//        //both print same thing so we can say a.next store address of b indirectly

//        System.out.println(b.data); //print  15
//
//        // print  5  15  25  35  45
//        System.out.println(a.next.data);    //it also prints same thing
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

        Node temp = a;  // not making new node its meaning is a and temp pointing same place
        //all  time we don't know the number of nodes of linked list so we prefer while loop instead of for loop

//        for(int i = 0 ; i < 5 ; i++)
//        {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
        print(a);
        System.out.println();
        print_reverse(a);
        insert_at_end(a,90);
        print(a);
    }
}
