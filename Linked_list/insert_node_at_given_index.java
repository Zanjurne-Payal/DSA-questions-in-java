package Linked_list;

public class insert_node_at_given_index {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedList{
            Node head = null;
            Node tail = null;

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
            void insert_at_end(int data)
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
            }
            void insert_at_idx(int idx , int data)
            {
                Node t = new Node(data);
                Node temp = head;
                if(idx == 0)
                {
                    insert_at_beginning(data);
                    return;
                }
                else if(idx == size())
                {
                    insert_at_end(data);
                    return;
                }
                else if(idx < 0 || idx > size())
                {
                    System.out.println("Wrong index");
                }
                for(int i = 1 ; i < idx ; i++)
                {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
            }
            void display()
            {
                Node temp = head;
                while(temp != null)
                {
                    System.out.print(temp.data+"  ");
                    temp = temp.next;
                }
                System.out.println();
            }
         }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.insert_at_end(15);
        l.insert_at_end(20);
        l.insert_at_end(30);

        l.display();
        l.insert_at_idx(1,100);

        l.display();
    }
}
