package linkedist_interview_quations;
public class find_max_twin_sum {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    static class linkedList {
        Node head = null;
        Node tail = null;

        void add(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println();
        }

        Node reverse(Node head) {
            Node curr = head;
            Node left = null;
            Node right = null;
            while (curr != null) {
                right = curr.next;
                curr.next = left;
                left = curr;
                curr = right;
            }
            return left;
        }
        int find_max()
        {
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node temp = reverse(slow.next);
            slow.next = temp;
            Node p1 = head;
            Node p2 = slow.next;
            int max = Integer.MIN_VALUE;
            while(p2 != null)
            {
                if(p1.data+p2.data > max)
                {
                    max = p1.data+p2.data;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
            return max;
        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.add(10);
        l.add(20);
        l.add(40);
        l.add(60);
        l.display();
        l.head = l.reverse(l.head);
        l.display();
        System.out.println("Maximum addition of pairs "+l.find_max());
        // 10+60 = 70
        //20+40 = 60
        //ans = 70

    }
}
