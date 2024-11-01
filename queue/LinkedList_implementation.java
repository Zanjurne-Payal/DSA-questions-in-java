package queue;
import java.util.*;
public class LinkedList_implementation {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class Queue
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
            size++;
        }
        int remove()
        {
            if(head == null)
            {
                System.out.println("Queue is empty");
            }
            int a = head.data;
            head = head.next;
            size--;
            return a;
        }
        int peek()
        {
            return head.data;
        }
        boolean isEmpty()
        {
            if(size > 0)return false;
            return true;
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
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size);
    }
}
