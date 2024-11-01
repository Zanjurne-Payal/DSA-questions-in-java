package linkedist_interview_quations;

public class two_linked_lists_connected_at_one_point_find_that {
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
        void concate(linkedList l2)
        {
            Node temp = head;
            for(int i = 1 ; i < 4 ; i++)
            {
                temp = temp.next;
            }
            l2.tail.next = temp;
            l2.tail = temp;
        }
    }
    static int find_common(linkedList l1 , linkedList l2)
    {
        Node temp1 = l1.head;
        Node temp2 = l2.head;
        //int ans = -1;
        int size1 = 0 , size2 = 0;
        while(temp1 != null)
        {
            size1++;
            temp1 = temp1.next;
        }
        while(temp2 != null)
        {
            size2++;
            temp2 = temp2.next;
        }
        temp1 = l1.head;
        temp2 = l2.head;
        if(size1 > size2)
        {
            int ele = size1 - size2;
            for(int i = 0 ; i < ele ; i++)
            {
                temp1 = temp1.next;
            }
        }
        else
        {
            int ele = size2 - size1;
            for(int i = 0 ; i < ele ; i++)
            {
                temp2 = temp2.next;
            }
        }
//        while(temp1 != null && temp2 != null)
//        {
//            if(temp1.data == temp2.data)return temp1.data;
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//        }
        while(temp1 != temp2)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        //return ans;
        return temp1.data;
    }
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        linkedList l2 = new linkedList();
        l1.add_at_end(10);
        l1.add_at_end(20);
        l1.add_at_end(30);
        l1.add_at_end(40);
        l1.add_at_end(50);
        l2.add_at_end(100);
        l2.add_at_end(200);
        l1.concate(l2);
        System.out.println("The node connected from  "+find_common(l1,l2));
        l1.display();
        l2.display();
    }
}
