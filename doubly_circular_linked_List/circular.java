package doubly_circular_linked_List;

public class circular {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    static void display_singly_circular(Node head)
    {
        Node temp = head;
        System.out.print(head.data+"   ");
        while(temp.next != head)
        {
            System.out.print(temp.next.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node delete_head(Node head)
    {
        Node temp = head;
        while(temp.next != head)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        head = temp.next;
        return head;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;
        System.out.println(delete_head(a).data);
        display_singly_circular(b);
    }
}
