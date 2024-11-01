package doubly_circular_linked_List;

public class insertion_in_DLL {
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
    static class DLL
    {
        Node head = null;
        Node tail = null;
        Node insert_at_start(Node head , int data)
        {
            Node temp = new Node(data);
            temp.next = head;
            head.prev = temp;
            head = temp;
            return head;
        }
        void insert_at_end(Node head , int data)
        {
            Node t = new Node(data);
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = t;
            t.prev = temp;
            temp = t;
        }
        void insert_at_idx(Node head , int idx , int data)
        {
            Node temp = new Node(data);
            Node p = head;
            for(int i = 1 ; i < idx ; i++)
            {
                p = p.next;
            }
            Node n = p.next;
            p.next = temp;
            temp.prev = p;
            n.prev = temp;
            temp.next = n;
        }
        void delete_head(Node head)
        {
            head = head.next;
            head.prev = null;
        }
        void delete_tail(Node head)
        {
            Node temp = head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        void delete_at_idx(Node head , int idx )
        {
            Node temp = head;
            for(int i = 1 ; i < idx ; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
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
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        a.next = b;
        b.next = c;
        c.prev = b;
        b.prev = a;
        DLL d = new DLL();
        d.display(a);

        Node e = d.insert_at_start(a,20);
        d.insert_at_end(a , 300);
        d.insert_at_end(a , 300);
        d.insert_at_end(a , 300);
        d.insert_at_idx(e , 2 , 400);
        d.delete_head(e); //delete 400
        d.delete_tail(a);//delete 300
        d.delete_at_idx(a,3); // delete 30
        d.display(a);
    }
}
