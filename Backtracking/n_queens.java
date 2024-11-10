package Backtracking;
import java.util.*;
public class n_queens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                board[i][j] = 'X';
            }
        }
        queen(board , 0);
    }

    private static void queen(char[][] board, int row) {
        int n = board.length;
        if(row == n)
        {
            for(int i = 0 ; i < n ; i++)
            {
                for(int j = 0 ; j < n ; j++)
                {
                    System.out.print(board[i][j]+"     ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            return;
        }
        for(int i = 0 ; i < n ; i++)
        {
            if(isSafe(board , row , i))
            {
                board[row][i] = 'Q';
                queen(board , row+1);
                board[row][i] = 'X';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        //check up - down && left-right
        for(int  i= 0 ; i < n ; i++)
        {
            if(board[row][i] == 'Q' || board[i][col] == 'Q')return false;
        }

        //check up-right
        int i = row , j = col;
        while(i >= 0 && j < n)
        {
            if(board[i--][j++] == 'Q')return false;
        }

        //check up-left
         i = row ;
         j = col;
        while(i >= 0 && j >= 0)
        {
            if(board[i--][j--] == 'Q')return false;
        }

        //check down-left
        i = row ;
        j = col;
        while(i < n && j >= 0)
        {
            if(board[i++][j--] == 'Q')return false;
        }

        //check down-right
        i = row ;
        j = col;
        while(i < n && j < n )
        {
            if(board[i++][j++] == 'Q')return false;
        }

        return true;
    }
}
