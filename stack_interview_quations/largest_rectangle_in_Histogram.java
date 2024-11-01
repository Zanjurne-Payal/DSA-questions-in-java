package stack_interview_quations;

import java.util.Stack;

public class largest_rectangle_in_Histogram {
    static int find_large_area(int[] arr)
    {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        // calculating nse
        st.push(n-1);
        nse[n-1] = n;
        for(int i = n-2 ; i >= 0 ; i--)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }
            if(st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }

        // Making stack empty
        while(!st.isEmpty())
        {
            st.pop();
        }

        //calculating pse
        st.push(0);
        pse[0] = -1;
        for(int i = 1 ; i < n ; i++)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }
            if(st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        //calculating max area
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++)
        {
            int area = arr[i]+(nse[i] - pse[i] - 1);
            if(area > max) max = area;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2 , 1 , 5 , 6 , 2 , 3};
        //nse = 1 6 4 4 6 6
        //pse = -1 -1 1 2 1 4
        System.out.println(find_large_area(arr));
    }
}
