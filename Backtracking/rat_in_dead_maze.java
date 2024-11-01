//we have some brake points in that rat cannot go
package Backtracking;
import java.util.*;
public class rat_in_dead_maze {
    public static void main(String[] args) {
        int row = 4;
        int cols = 6;
        int[][]maze = {
                {1 , 0 , 1 , 1 , 1 , 1},
                {1 , 1 , 1 , 1 , 0 , 1},
                {0 , 1 , 1 , 1 , 1 , 1},
                {0 , 0 , 1 , 0 , 1 , 1}
        };
        printPath(0,0,row-1,cols-1,"",maze);
    }
    private static void printPath(int sr, int sc, int er, int ec , String path , int[][] maze) {
        if(sr > er || sc > ec)return;
        if(maze[sr][sc] == 0)return;
        if(sr == er && sc == ec)
        {
            System.out.println(path);
            return;
        }
        printPath(sr+1 , sc , er , ec , path+"D" , maze);
        printPath(sr , sc+1 , er , ec , path+"R" , maze);
    }
}
