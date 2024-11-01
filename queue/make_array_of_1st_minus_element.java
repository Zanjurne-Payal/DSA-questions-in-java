// arr = 6 -1 2 3 -3 -2 6 7 8
// window of 3 pair 6 -1 2   -1 2 3    2 3 -3    3 -3 -2   -3 -2 6    -2 6 7    6 7 8
//ans = -1 -1 -3 -3 -3 -2 0

package queue;
import java.util.*;
public class make_array_of_1st_minus_element {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {6 , -1 , 2 , 3 , -3 , -2 , 6 , 7 , 8};
        int[] res = new int[arr.length-k+1];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] < 0)q.add(i);
        }
        for(int i = 0 ; i < arr.length-k+1 ; i++)
        {
            if(q.size() > 0 && q.peek() < i)q.remove();
            if(q.size() > 0 && q.peek() < i+k )
            {
                res[i] = arr[q.peek()];
            }
            else res[i] = 0;
        }
        for(int i = 0 ; i < res.length ; i++)
        {
            System.out.print(res[i]+"  ");
        }
    }
}
