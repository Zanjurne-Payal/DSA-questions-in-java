package stack_interview_quations;
import java.util.*;
public class Next_Grater_element {
    static void nextGrater(int[] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            int res = -1;
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[j] > arr[i])
                {
                    res = arr[j];
                    break;
                }
            }
            System.out.print(res+"  ");
        }
    }
    static int[] nextGrate_efficient(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int[] brr = new int[arr.length];
        st.add(arr[arr.length-1]);
        brr[brr.length-1] = -1;
        for(int i = arr.length-2 ; i >= 0 ; i--)
        {
            if(arr[i] < st.peek())
            {
                brr[i] = st.peek();
                st.push(arr[i]);
            }
            else
            {
                while(st.size() > 0 && st.peek() < arr[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    brr[i] = -1;

                    st.push(arr[i]);

                }
                else
                {
                    brr[i] = st.peek();
                    st.push(arr[i]);
                }
            }
        }
        return brr;
    }
    static int[] nextGrater_best(int[] arr)
    {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        ans[0] = 1;
        for(int i = 1 ; i < ans.length ; i++)
        {
            if(arr[i] < arr[st.peek()])
            {
                     st.push(i);
            }
            else
            {
                while(!st.isEmpty() && arr[i] > arr[st.peek()])
                {
                    ans[st.peek()] = arr[i];
                    st.pop();
                    st.push(i);
                }
            }
        }
        for(int i = 0 ; i < ans.length ; i++)
        {
            if(ans[i] == 0)ans[i] = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1 , 3 , 2 , 1 , 8 , 6 , 3 , 4};
        System.out.println("Basic method");
        nextGrater(arr);
        System.out.println("\nStandard way");
        int[] res = nextGrate_efficient(arr);
        for(int i = 0 ; i < res.length ; i++)
        {
            System.out.print(res[i]+"  ");
        }

        System.out.println("\n best approch");
        int[] res1 = nextGrater_best(arr);
        for(int i = 0 ; i < res1.length ; i++)
        {
            System.out.print(res1[i]+"  ");
        }
    }
}
