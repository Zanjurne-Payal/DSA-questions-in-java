package Linked_list;

public class insert_at_beginning {
    public static class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList
    {
        Node head = null;
        Node tail = null;

        void insert_at_beginning(int data){
            Node temp = new Node(data);
            if(head == null && tail == null)
            {
//                head = temp;
//                tail = temp;
                head = tail = temp;
            }
            else
            {
                temp.next = head;
                head = temp;
            }
        }
        void display()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.insert_at_beginning(5);
        l.insert_at_beginning(4);
        l.insert_at_beginning(3);
        l.insert_at_beginning(2);
        l.insert_at_beginning(1);
        l.display();
    }
}
