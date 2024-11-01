package queue;
import java.util.*;
public class reverse_k_elements {
    static void reverse_k(int k , Queue<Integer> q)
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < k ; i++)
        {
            st.push(q.remove());
        }
        for(int i  = 0 ; i < k ; i++)
        {
            q.add(st.pop());
        }
        for(int i = 0 ; i < q.size()-k ; i++)
        {
            int a = q.remove();
            q.add(a);
        }
        System.out.println("After : "+q);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("Enter the k");
        int k = sc.nextInt();
        System.out.println("Queue : "+q);
        if(k > q.size())
        {
            System.out.println("please enter valid input");
        }
        else {
            reverse_k(k, q);
        }
    }
}
