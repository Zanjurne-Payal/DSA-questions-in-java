package linkedist_interview_quations;

public class deleting_middle_element {
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
        }
        void find_middle()
        {
            Node slow = head;
            Node fast = head;
            if(head.next == null)return;
            while( fast.next.next != null && fast.next.next.next != null)
            {
                fast = fast.next.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
        }
        void display()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"   ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.display();
        l.find_middle();
        l.display();
    }
}
