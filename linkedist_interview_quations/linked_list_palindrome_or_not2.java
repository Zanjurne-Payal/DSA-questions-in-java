package linkedist_interview_quations;

public class linked_list_palindrome_or_not2 {
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
        Node reverse(Node temp)
        {
            if(temp.next == null)return temp;
            Node newh = reverse(temp.next);
            temp.next.next = temp;
            temp.next = null;
            return newh;
        }
       Node reverse_iteratively(Node temp , Node mid)
        {
            Node curr = head;
            Node left = null;
            Node right = null;
                while(curr != mid)
                {
                    right = curr.next;
                    curr.next = left;
                    left = curr;
                    curr = right;
                }
            return left;
        }
        boolean isPalindrome(Node head)
        {
            Node slow = head;
            Node fast = head;
            while(fast.next != null && fast.next.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node temp = reverse(slow.next);
            slow.next = temp;
            Node p1 = head;
            Node p2 = slow.next;
            while(p2 != null)
            {
                if(p1.data != p2.data)return false;
                p1 = p1.next;
                p2 = p2.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(20);
        l.add(10);
        l.display(l.head);
        System.out.println("Is this linked list is palindrome "+l.isPalindrome(l.head));
        l.display(l.head);
    }
}
