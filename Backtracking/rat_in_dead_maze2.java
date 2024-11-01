package Backtracking;
import java.util.*;
public class rat_in_dead_maze2 {
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
        if(sr < 0 || sc < 0)return;
        if(sr > er || sc > ec)return;
        if(maze[sr][sc] == -1)return;
        if(maze[sr][sc] == 0)return;
        if(sr == er && sc == ec)
        {
            System.out.println(path);
            return;
        }
        maze[sr][sc] = -1;
        // down
        printPath(sr+1 , sc , er , ec , path+"D" , maze);
        //right
        printPath(sr , sc+1 , er , ec , path+"R" , maze);
        //Up
        printPath(sr-1 , sc , er , ec , path+"U" , maze);
        //left
        printPath(sr , sc-1 , er , ec , path+"L" , maze);

        //backTracking
        maze[sr][sc] = 1;
    }
}
