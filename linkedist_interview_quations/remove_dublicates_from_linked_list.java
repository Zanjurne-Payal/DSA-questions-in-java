package linkedist_interview_quations;

public class remove_dublicates_from_linked_list {
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
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
            System.out.println();
        }
        void remove_duplicates(Node head)
        {
            Node temp = head;
            while(temp != null && temp.next != null)
            {
                if(temp.data == temp.next.data)
                {
                        temp.next = temp.next.next;
                }
                else temp = temp.next;
            }
            display(head);
        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(15);
        l.add(25);
        l.add(90);
        l.add(90);
        l.add(100);
        l.display(l.head);
        l.remove_duplicates(l.head);
    }
}
