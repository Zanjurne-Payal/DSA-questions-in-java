package stack_interview_quations;
import java.util.*;
public class calculate_span_stack_price {
    static class pair{
        int data;
        int idx;
        pair(int idx , int data )
        {
            this.data = data;
            this.idx = idx;
        }
    }
    static int[] find_span(int[] arr)
    {
        int[] ans = new int[arr.length];
        Stack<pair> st = new Stack<>();
        ans[0] = 1;
        st.addElement(new pair(0 , arr[0]));
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] < st.peek().data)
            {
                ans[i] = i-st.peek().idx;
                st.push(new pair(i , arr[i]));
            }
            else
            {
                while(!st.isEmpty() && arr[i] > st.peek().data)
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    ans[i] = i+1;
                    st.push(new pair(i , arr[i]));
                }
                else
                {
                    ans[i] = i - st.peek().idx;
                    st.push(new pair(i , arr[i]));
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {100 , 80 , 60 , 70 , 60 , 75 , 85};
        // ans = 1 , 1 , 1 , 2 , 1 , 4 , 6
        int[] ans = find_span(arr);
        for(int i = 0 ; i < ans.length ; i++)
        {
            System.out.print(ans[i]+"     ");
        }
    }
}
