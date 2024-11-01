package linkedist_interview_quations;

public class merge_2_linkedlists_widaut_extra_space {
    static class Node{
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
        }
        void display(Node head)
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"   ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    static void merge(linkedList l1 , linkedList l2)
    {
        linkedList l3 = new linkedList();
        Node head = new Node(1000);
        Node t = head;
        Node temp1 = l1.head;
        Node temp2 = l2.head;
        while(temp1 != null && temp2 != null)
        {
            if(temp1.data <= temp2.data)
            {
                t.next = temp1;
                t = temp1;
                temp1 = temp1.next;
            }
            else{
                t.next = temp2;
                t = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1 != null)
        {
            t.next = temp1;
        }
        if(temp2 != null)
        {
            t.next = temp2;
        }
        l3.display(head.next);
    }
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.add(10);
        l1.add(30);
        l1.add(50);
        l1.add(70);
        l1.display(l1.head);
        linkedList l2 = new linkedList();
        l2.add(10);
        l2.add(20);
        l2.add(40);
        l2.add(60);
        l2.display(l2.head);
        merge(l1,l2);
    }
}
