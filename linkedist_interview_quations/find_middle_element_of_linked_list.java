package linkedist_interview_quations;

public class find_middle_element_of_linked_list {
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
       int find_middle()
       {
           Node slow = head;
           Node fast = head;
           //fast != null   = for right most middle
           //fast.next.next != null  = for left most middle
           while(fast != null && fast.next != null)
           {
               fast = fast.next.next;
               slow = slow.next;
           }
           return slow.data;
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
        System.out.println("Middle element = "+l.find_middle());
    }
}
