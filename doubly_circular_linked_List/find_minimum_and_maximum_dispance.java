//Not solving completely
package doubly_circular_linked_List;

public class find_minimum_and_maximum_dispance {
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
    static void find_distance(Node head)
    {
        Node temp = head.next;
        Node c1 = null;
        Node c2 = null;
        int min = -1;
        int max = 900;
        int idx = 1;
        while(temp.next != null)
        {
            if((temp.data > temp.prev.data && temp.data > temp.next.data)|| (temp.data < temp.prev.data && temp.data < temp.next.data))
            {
                if(c1 == null)
                {
                    c1 = c2 = temp;
                }
                else {

                }
            }

        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);
        Node j = new Node(1);
        Node i = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = j;
        j.next = i;

        i.prev = j;
        j.prev = h;
        h.prev = g;
        g.prev = f;
        f.prev = e;
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
    }
}
