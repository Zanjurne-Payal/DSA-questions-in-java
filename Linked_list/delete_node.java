package Linked_list;

public class delete_node {
    public static class Node{
        int data ;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;       //if we use this don't need to make function

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        get_element.linkedList l = new get_element.linkedList();
        l.insertAtEnd(50);
        l.insertAtEnd(51);
        l.insertAtEnd(52);
        l.insertAtEnd(53);
        l.display();
    }
}
