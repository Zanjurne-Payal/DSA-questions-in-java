package linkedist_interview_quations;
import java.util.*;
public class delete_n_node_from_last {
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
        int size = 0;
        void add_at_end(int data)
        {
            Node temp = new Node(data);
            if(head == null)
            {
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void display()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"  ");
                temp = temp.next ;
            }
            System.out.println();
        }
        void delete_from_last(int n)
        {
            Node temp = head;
            int idx = (size - n) + 1;
            if(idx == 1)    //checkmark if we want to delete head
            {
                head = head.next;
            }
            for(int i = 1 ; i < idx-1 ; i++)
            {
                temp = temp.next;
            }
            temp. next = temp.next.next;
        }
        //best approch
        int find_n_element_from_last(int n)
        {
            Node fast = head;
            Node slow = head;
            for(int i = 0 ; i < n ; i++)
            {
                fast = fast.next;
            }
            while(fast != null)
            {
                fast = fast.next;
                slow = slow.next;
            }
            return slow.data;
        }
        void delete_last_nth_element(int n)
        {
            Node fast = head;
            Node slow = head;
            for(int i = 0 ; i < n ; i++)
            {
                fast = fast.next;
            }
            if(fast == null)//checkmark if we want to delete head
            {
                head = head.next;
                return;
            }

            while(fast.next != null)
            {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index from last to delete");
        int n = sc.nextInt();
        linkedList l = new linkedList();
        l.add_at_end(1);
        l.add_at_end(2);
        l.add_at_end(3);
        l.add_at_end(4);
        l.add_at_end(5);
        l.add_at_end(6);
        l.add_at_end(7);
        l.display();
        System.out.println("size of linked list "+l.size);
        System.out.println(" which element present at n idx from end ? "+l.find_n_element_from_last(n));
        System.out.println("After deletion node");
        l.delete_from_last(n);
        l.display();
        l.delete_last_nth_element(n);
        l.display();

    }
}
