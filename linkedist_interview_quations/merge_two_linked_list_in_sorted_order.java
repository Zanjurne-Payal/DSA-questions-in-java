package linkedist_interview_quations;

public class merge_two_linked_list_in_sorted_order {
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
         void merge(linkedList l1 , linkedList l2)
        {
            linkedList l3 = new linkedList();
            Node temp1 = l1.head;
            Node temp2 = l2.head;
            if(l3.head == null)
            {
                Node temp3;
                if(temp1.data <= temp2.data)
                {
                    temp3 = new Node(temp1.data);
                    temp1 = temp1.next;
                }
                else {
                    temp3 = new Node(temp2.data);
                    temp2 = temp2.next;
                }
                l3.head = temp3;
                l3.tail = temp3;
            }

            while(temp1 != null && temp2 != null)
            {
                if(temp1.data <= temp2.data)
                {
                    Node temp3 = new Node(temp1.data);
                    l3.tail.next = temp3;
                    l3.tail = temp3;
                    temp1 = temp1.next;
                }
                else{
                    Node temp3 = new Node(temp2.data);
                    l3.tail.next = temp3;
                    l3.tail = temp3;
                    temp2 = temp2.next;
                }
            }
//            while(temp1 != null)
//            {
//                Node temp3 = new Node(temp1.data);
//                l3.tail.next = temp3;
//                l3.tail = temp3;
//                temp1 = temp1.next;
//            }
//            while(temp2 != null)
//            {
//                Node temp3 = new Node(temp2.data);
//                l3.tail.next = temp3;
//                l3.tail = temp3;
//                temp2 = temp2.next;
//            }
            if(temp1 != null)
            {
                l3.tail.next = temp1;
                l3.tail = temp1;
            }
            if(temp2 != null)
            {
                l3.tail.next = temp2;
                l3.tail = temp2;
            }
            l3.display();
        }
    }
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.add(10);
        l1.add(30);
        l1.add(50);
        l1.add(70);
        l1.display();
        linkedList l2 = new linkedList();
        l2.add(10);
        l2.add(20);
        l2.add(40);
        l2.add(60);
        l2.display();
        l1.merge(l1,l2);
    }
}
