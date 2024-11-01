package linkedist_interview_quations;

public class linked_list_cycle {
    static class Node
    {
        int data ;
        Node next ;
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
            // writing random code for making cycle
            if(temp.data == 40)
            {
                temp.next = head.next;
            }
        }
        boolean check()
        {
            Node fast = head;
            Node slow = head;
            if(head == null || head.next == null)return false;
            while(fast != null)
            {
                if(slow == null)return false;
                slow = slow.next;
                if(fast.next == null)return false;
                fast = fast.next.next;
                if(slow == fast)return true;
            }
            return false;
        }
        int find_circular_point()
        {
            Node fast = head;
            Node slow = head;
            while(fast != null)
            {
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow)break;
            }
            Node temp = head;
            while(temp != slow)
            {
                temp = temp.next;
                slow = slow.next;
            }
            return slow.data;
        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println("Is this linked list is circular ? "+l.check());
        if(l.check())
        {
            System.out.println("The linked list circular point is "+l.find_circular_point());
        }
    }
}
