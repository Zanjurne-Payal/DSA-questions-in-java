package queue;
import java.util.*;
public class Array_implementation {
    public static class Queue
    {
        int[] arr = new int[100];
        int f = -1;
        int r = -1;
        int size = 0;
        void add(int data)
        {
            if(r == arr.length-1)
            {
                System.out.println("Index Out of bound");
                return;
            }
//            if(f == -1) f = r = 0;
//            else
//            {
//                arr[++r] = data;
//            }

            if(f == -1)
            {
                f = r = 0;
            }
            arr[r++] = data;
            size++;
        }
        int remove()
        {
            if(size == 0)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        int peek()
        {
            if(size == 0)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        boolean isEmpty()
        {
            if(size == 0)return true;
            return false;
        }
        void display()
        {
            if(size == 0)
            {
                System.out.println("Queue is empty");
                return;
            }
            for(int i = f ; i < r ; i++)
            {
                System.out.print(arr[i]+"     ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size);
    }
}
