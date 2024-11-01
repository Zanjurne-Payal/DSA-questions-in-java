package linkedist_interview_quations;

public class linked_list_palindrome_or_not {
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
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
            System.out.println();
        }
        Node reverse_iteratively(Node temp)
        {
            Node curr = head;
            Node left = null;
            Node right = null;
            while(curr != null)
            {
                right = curr.next;
                curr.next = left;
                left = curr;
                curr = right;
            }
            return left;
        }
        boolean isPalindrome(linkedList l1 , linkedList l2)
        {
            Node temp = l1.head;
            Node temp2 = l2.head;
            while(temp != null)
            {
                if(temp.data != temp2.data) return false;
                temp = temp.next;
                temp2 = temp2.next;
            }
            return true;
        }
    }
    static void deepCopy(linkedList l1 , linkedList l2)
    {
        Node temp = l1.head;
        while(temp != null)
        {
            l2.add(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(20);
        l.add(10);
        linkedList l2 = new linkedList();
        deepCopy(l , l2);
        l.display();
        l2.head = l2.reverse_iteratively(l2.head);
        l2.display();
        System.out.println("is linkedList is palindrome "+l.isPalindrome(l,l2));
    }
}
