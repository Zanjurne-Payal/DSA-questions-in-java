package Stack_infix_prefix_postfix;
import java.util.*;
public class celebrity_problem {
    public static void main(String[] args) {
        int[][] arr = {{0 , 1, 0},{0 , 0 , 0},{ 0 , 1 , 0}};
        Stack<Integer> val = new Stack<>();
        for(int i = 0 ; i < 3 ; i++)
        {
            val.push(i);
        }
        while(val.size() > 1)
        {
            int v1 = val.pop();
            int v2 = val.pop();
            if(arr[v1][v2] == 0) val.push(v1);
            else if(arr[v2][v1] == 0) val.push(v2);
        }
        if(val.isEmpty())
        {
            System.out.println("No one is celebrity");
        }
        else
        {
            int a = val.pop();
            for(int i = 0 ; i < 3 ; i++)
            {
                if(arr[a][i] == 1)
                {
                    System.out.println("Not celebrity");
                    break;
                }
            }
            for(int i = 0 ; i < 3 ; i++)
            {
                if(i == a)continue;
                if(arr[i][a] == 0)
                {
                    System.out.println("Not celebrity");
                    break;
                }
                else {
                    System.out.println("the celebrity is " + a);
                    break;
                }
            }
        }
    }
}
