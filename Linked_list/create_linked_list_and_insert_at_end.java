package Linked_list;

public class create_linked_list_and_insert_at_end {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{
        Node head = null;
        Node tail = null;
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
        }

        void display(){
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
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
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.insertAtEnd(5);
        l.insertAtEnd(15);
        l.insertAtEnd(25);
        l.insertAtEnd(35);
        System.out.println("Linked list elements are");
        l.display();
        l.insertAtEnd(45);
        l.insertAtEnd(55);
        System.out.println("\nLinked list elements after adding new elements");
        l.display();
        System.out.println("\nSize of linked list "+l.size());
    }
}
