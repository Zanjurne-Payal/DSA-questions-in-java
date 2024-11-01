package linkedist_interview_quations;

public class split_linked_list_odd_even {
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
            else{
                tail.next = temp;
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
        void split_linked_list()
        {
             Node e = new Node(0);
             Node tempe = e;
             Node o =new Node(0);
             Node tempo = o;
             Node temp = head;
             while(temp != null) {
                 Node data = new Node(temp.data);
                 if (temp.data % 2 == 0)
                 {
                     tempe.next = data;
                     tempe = data;
                 }
                 else
                 {
                     tempo.next = data;
                     tempo = data;
                 }
                 temp = temp.next;
             }
             e = e.next;
             o = o.next;
             tempo.next = e;
             display(o);
        }
        void split_according_to_idx()
        {
            Node e = new Node(0);
            Node tempe = e;
            Node o = new Node(0);
            Node tempo = o;
            Node temp = head;
            while(temp != null)
            {
               tempo.next = temp;
               temp = temp.next;
               tempo = tempo.next;

               tempe.next = temp;
               if(temp == null)break;
               temp = temp.next;
               tempe = tempe.next;
            }
            o = o.next;
            e = e.next;
            tempo.next = e;
            display(o);
        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.add(5);
        l.add(2);
        l.add(6);
        l.add(3);
        l.add(9);
        l.add(4);
        l.display(l.head);
        l.split_linked_list();  // print according to data
        l.split_according_to_idx(); // print according to index
        //print all odd 1st the even
    }
}
