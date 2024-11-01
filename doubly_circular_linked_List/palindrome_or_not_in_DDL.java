package doubly_circular_linked_List;

public class palindrome_or_not_in_DDL {
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
    static boolean is_palindrome(Node head)
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        Node temp2 = head;
        while(temp2 != temp)
        {
            if(temp.data != temp2.data)return false;
            temp2 = temp2.next;
            temp = temp.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(30);
        Node e = new Node(20);
        Node f = new Node(10);
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
        System.out.println("Is given linkedList is palindrome   "+is_palindrome(a));
    }
}
