package stack_interview_quations;
import java.util.*;
public class previous_grater_element {
    static int[] previousGrater(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        res[0] = -1;
        st.push(arr[0]);
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] < st.peek())
            {
                res[i] = st.peek();
                st.push(arr[i]);
            }
            else
            {
                while(!st.isEmpty() && arr[i] > st.peek())
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    res[i] = -1;
                    st.push(arr[i]);
                }
                else
                {
                    res[i] = st.peek();
                    st.push(arr[i]);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {100 , 80 , 60 , 70 , 75 , 85};
        //ans = -1 , 100 , 80 , 70 , 80 , 100;
        int[] res = previousGrater(arr);
        for(int i = 0 ; i < res.length ; i++)
        {
            System.out.print(res[i]+"     ");
        }
    }
}
