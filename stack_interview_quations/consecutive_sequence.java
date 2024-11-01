// the elements come 2 or more times
// 1 2 2 3 3 3 4 5 5 6 6 6 7 2
//new arr = 1 4 7 2

package stack_interview_quations;
import java.util.*;
public class consecutive_sequence {
    static int[] consecutive(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(st.isEmpty() || st.peek() != arr[i])st.push(arr[i]);
            else if(arr[i] == st.peek())
            {
                if(i == arr.length-1 ||arr[i] != arr[i+1])
                {
                    st.pop();
                }
            }
        }
        int[] res = new int[st.size()];
        for(int i = res.length-1 ; i >= 0 ; i--)
        {
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\nUnique array");
        int[] brr = consecutive(arr);
        for(int i = 0 ; i < brr.length ; i++)
        {
            System.out.print(brr[i]+"  ");
        }
    }
}
