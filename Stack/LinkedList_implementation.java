package Stack;

public class LinkedList_implementation {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    static class Stack
    {
        Node head = null;
        int size = 0;
        void push(int ele)
        {
                Node temp = new Node(ele);
                temp.next = head;
                head = temp;
                size++;
        }
        int pop()
        {
            int top = -1;
            if(head == null)
            {
                System.out.println("Stack is empty");
                return top;
            }
            top = head.data;
           head = head.next;
           size--;
            return top;
        }
        int size()
        {
            return size;
        }
        void display_rev()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
            System.out.println();
        }
        void display(Node h)
        {
            if(h == null)return;
            display(h.next);
            System.out.print(h.data+"  ");
        }
        int peek()
        {
            if(head == null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
        boolean is_Empty()
        {
            if(head == null)return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st.pop());

        System.out.println(st.size());

        System.out.println(st.peek());

        st.display(st.head);

    }
}
