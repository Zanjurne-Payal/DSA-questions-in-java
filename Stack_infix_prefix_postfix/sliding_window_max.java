package Stack_infix_prefix_postfix;
import java.util.*;
public class sliding_window_max {
    // basic way to solve  question
    static public int[] maxSlideWindow(int[] arr , int k)
    {
        int n = arr.length;
        int[] ans = new int[n-k+1];
        int z = 0;
        for(int i = 0 ; i < n-k+1 ; i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j = i ; j < i+k ; j++)
            {
                if(arr[j] > max) max = arr[j];
            }
            ans[z++] = max;
        }
        return ans;
    }

    // optimize way
    static public int[] maxSlideWindow2(int[] arr , int k)
    {
        int n = arr.length;
        int[] ans = new int[n-k+1];
        int z = 0;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n-1);
        nge[n-1] = -1;
        for(int i = n-2 ; i >= 0 ; i--)
        {
         while(!st.isEmpty() && arr[i] > arr[st.peek()])st.pop();
         if(st.isEmpty()) arr[i] = -1;
         else arr[i] = st.peek();
         st.push(i);
        }
        for(int i = 0 ; i < n-k+1 ; i++)
        {
            int j = i;
            while(j < i + k)
            {
               // max = arr[j];
                j = nge[j];

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1 , 3 , -1 , -3 , 5 , 3 , 6 , 7 };
        // output = 3 3 5 5 6 7
        int k = 3;
        int[] ans = maxSlideWindow(arr , k);
        for(int i = 0 ; i < ans.length ; i++)
        {
            System.out.print(ans[i]+"     ");
        }
    }
}
