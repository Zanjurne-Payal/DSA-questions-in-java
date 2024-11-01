package linkedist_interview_quations;

public class make_deep_copy {
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
            else{
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
        Node copy(Node temp1)
        {
            Node h = new Node(0);
            Node temp2 = h;
            Node temp = temp1;
            while(temp != null)
            {
                Node t = new Node(temp.data);
                temp2.next = t;
                temp2 = t;
            }
            h = h.next;
            temp2 = h;
            temp = temp1;
            return temp2;
        }
    }

    public static void main(String[] args) {
        linkedList l = new linkedList();
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        a.next = b;
        b.next = c;
        c.next = d;
        l.display(a);
    }
}
