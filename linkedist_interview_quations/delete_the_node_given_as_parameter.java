package linkedist_interview_quations;

public class delete_the_node_given_as_parameter {
     static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    static class linkedList{
        Node head = null;
        Node tail = null;
        void add_at_end(int data)
        {
            Node temp = new Node(data);
            if(head == null)
            {
                head = temp;
                tail = temp;
            }
            else
            {
                tail.next = temp;
                tail = temp;
            }
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
        void delete_parameter(int data)
        {
            Node temp = head;
            while(temp.data != data)
            {
                temp = temp.next;
            }
            if(temp.next != null)
            {
                temp.data = temp.next.data;
                temp.next = temp.next.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.add_at_end(1);
        l.add_at_end(2);
        l.add_at_end(3);
        l.add_at_end(4);
        l.add_at_end(5);
        System.out.println("Original linked list");
        l.display();
        l.delete_parameter(3);
        System.out.println("linked list after deletion");
        l.display();
    }
}
