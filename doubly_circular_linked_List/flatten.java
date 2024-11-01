package doubly_circular_linked_List;

public class flatten {
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node child;
        Node(int data)
        {
            this.data = data;
        }
    }
    static class ddl
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
                temp.prev = tail;
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
        Node flatten(Node head)
        {
            Node temp = head;
            while(temp != null)
            {
                Node t = temp.next;
                if(temp.child != null)
                {
                    Node c = flatten(temp.child);
                    temp.next = c;
                    c.prev = temp;
                    while(c.next != null)
                    {
                        c = c.next;
                    }
                    c.next = t;
                    if(t != null)t.prev = c;

                }
                temp.child = null;
                temp = t;
            }
            return head;
        }
        void add_child(int idx , Node con)
        {
            Node temp = head;
            int i = 1;
            while(i++ < idx)
            {
                temp = temp.next;
            }
            temp.child = con;
        }
    }

    public static void main(String[] args) {
        ddl d = new ddl();
        ddl dd = new ddl();
        ddl ddd = new ddl();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        d.add(6);

        dd.add(7);
        dd.add(8);
        dd.add(9);
        dd.add(10);

        ddd.add(11);
        ddd.add(12);

        d.add_child(3 , dd.head);
        dd.add_child(4 , ddd.head);

        Node k = d.flatten(d.head);
        d.display(k);
    }
}
