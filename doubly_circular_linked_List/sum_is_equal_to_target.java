package doubly_circular_linked_List;

public class sum_is_equal_to_target {
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
        }
    }
    static void find_sum(Node head , int target)
    {
        int a = 0 , b = 0;
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        Node temp2 = head;
        while(temp2.data < temp.data)
        {
            if(temp.data+temp2.data == target)
            {
                a = temp.data;
                b = temp2.data;
                break;
            }
            else if(temp.data + temp2.data < target)
            {
                temp2 = temp2.next;
            }
            else
            {
                temp = temp.prev;
            }
        }
        System.out.println(a+"  +   "+b+"   =   "+target);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(30);
        Node e = new Node(40);
        Node f = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.prev = e;
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        find_sum(a , 50);
    }
}
