package linkedist_interview_quations;

import Linked_list.basics;

public class reverse_linked_list {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    static class linkedList
    {
        Node head = null;
        Node tail = null;
        int size = 0;
        void add(int data)
        {
            Node temp = new Node(data);
            if(head == null)
            {
                head = temp;
            }
            else
            {
                tail.next = temp;
            }
            tail = temp;
            size += 1;
        }
        void display()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
            System.out.println();
        }
        Node reverse(Node temp)
        {
            if(temp.next == null)return temp;
            Node newh = reverse(temp.next);
            temp.next.next = temp;
            temp.next = null;
            return newh;
        }
        Node reverse_iteratively(Node temp)
        {
            Node curr = head;
            Node left = null;
            Node right = null;
            while(curr != null)
            {
                right = curr.next;
                curr.next = left;
                left = curr;
                curr = right;
            }
            return left;
        }

    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.display();
       l.head = l.reverse(l.head);
       l.display();
       l.head = l.reverse_iteratively(l.head);
       l.display();
    }
}
