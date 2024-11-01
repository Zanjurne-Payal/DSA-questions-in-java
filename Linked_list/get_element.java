package Linked_list;

public class get_element {
    public static class Node{
        int data ;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class linkedList
    {
        Node head = null;
        Node tail = null;
        int size = 0;       //if we use this don't need to make function
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null)
            {
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void display(){
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null)
            {
                count++;
                temp = temp.next;
            }
            return count;
        }
        int find_element(int idx)
        {
            if(idx < 0 || idx > size())
            {
                System.out.println("invalid input");
                return -1;
            }
            Node temp = head;
            for(int i = 1; i <= idx; i++)
            {
                temp = temp.next;
            }
            return temp.data;
        }
        void delete_at(int idx)
        {
            Node temp = head;
            if(idx == 0)
            {
                head = head.next;
                size--;
                return;
            }
            for(int i = 1 ; i < idx ; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.insertAtEnd(50);
        l.insertAtEnd(51);
        l.insertAtEnd(52);
        l.insertAtEnd(53);
        l.display();
        l.delete_at(1);
        l.display();
    }
}
