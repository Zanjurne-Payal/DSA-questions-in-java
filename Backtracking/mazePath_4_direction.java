package Backtracking;
import java.util.*;
public class mazePath_4_direction {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[3][3];
        maze(0,0,rows-1,cols-1," ",isVisited);
    }

    private static void maze(int sr, int sc, int er, int ec,String path,boolean[][] isVisited) {
        if(sr < 0 || sc < 0)return;
        if(sc > ec || sr > er)return;
        if(isVisited[sr][sc])
        {
            return;
        }
        if(sc == ec && sr == er)
        {
            System.out.println(path);
            return;
        }
        isVisited[sr][sc] = true;
        //down
        maze(sr+1 , sc , er , ec , path+"D",isVisited);
        //up
        maze(sr-1 , sc , er , ec , path+"U",isVisited);
        //right
        maze(sr , sc+1 , er , ec , path+"R",isVisited);
        //left
        maze(sr , sc-1 , er , ec , path+"L",isVisited);

        isVisited[sr][sc] = false;  //backtracking
    }
}
