package Backtracking;
import java.util.*;
public class print_maze_path {
    public static void main(String[] args) {
        int row = 3;
        int cols = 3;
        printPath(1,1,row,cols,"");
    }

    private static void printPath(int sr, int sc, int er, int ec , String path) {
        if(sr > er || sc > ec)return;
        if(sr == er && sc == ec)
        {
            System.out.println(path);
            return;
        }
        printPath(sr+1 , sc , er , ec , path+"D");
        printPath(sr , sc+1 , er , ec , path+"R");
    }
}
