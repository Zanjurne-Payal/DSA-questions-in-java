//doubly linked list occupy more memory
package doubly_circular_linked_List;

public class doublyLL {
    static class Node
    {
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    static void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void display_rev(Node tail)
    {
        Node temp = tail;
        while(temp != null)
        {
            System.out.print(temp.data+"  ");
            temp = temp.prev;
        }
        System.out.println();
    }
    static void display_random(Node random)
    {
        Node temp = random;
        while(temp.prev != null)
        {
            temp = temp.prev;
        }
        while(temp!= null)
        {
            System.out.print(temp.data+"    ");
            temp = temp.next;
        }
        System.out.println();
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

        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;

        display(a);
        display_rev(e);
        display_random(b);
    }
}
