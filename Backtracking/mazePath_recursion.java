//the problem is one rate at the position 11 it has to go last point
//condition is rat only go to right and down
//count the total paths

package Backtracking;
import java.util.*;
public class mazePath_recursion {
    static int maze(int sr , int sc , int er , int ec)
    {
        if(sr > er || sc > ec)return 0;
        if(sr == er && sc == ec)return 1;

        int totalWays = maze(sr+1 , sc , er , ec)+maze(sr , sc+1 , er , ec);
        return totalWays;
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int count = maze(1,1,rows,cols);
        System.out.println(count);
    }
}
