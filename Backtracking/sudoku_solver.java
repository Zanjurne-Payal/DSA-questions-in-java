package Backtracking;

public class sudoku_solver {
    public static void solve(char[][] board , int row , int col , char[][] grid)
    {
        if(row == 9)
        {
            for (int i = 0; i < 9 ; i++) {
                for (int j = 0; j < 9 ; j++) {
                    grid[i][j] = board[i][j];
                }
            }
            return;
        }
      if(board[row][col] != '.')
      {
          if(col != 8) solve(board , row , col+1,grid);
          else solve(board , row+1 , 0,grid);
      }
      else{
          for (char i = '1'; i <= '9' ; i++) {
              if(isValid(board , row , col , i))
              {
                  board[row][col] = i;
                  if(col != 8) solve(board , row , col+1,grid);
                  else solve(board , row+1 , 0,grid);
                  board[row][col] = '.';
              }
          }
      }
    }
    public static void main(String[] args) {
        char[][] board = {
                {'3','8','.','1','.','2','5','.','4'},
                {'9','.','5','.','6','.','.','1','.'},
                {'.','7','.','.','.','.','.','.','9'},
                {'2','.','.','.','.','.','.','.','6'},
                {'.','3','.','.','.','.','.','2','.'},
                {'4','.','.','.','.','.','.','.','1'},
                {'7','.','.','.','.','.','.','3','.'},
                {'.','6','.','.','4','.','1','.','8'},
                {'8','.','3','5','.','6','.','4','2'}
        };
        char[][] grid = new char[9][9];
        solve(board , 0 , 0 , grid);
//        for (int i = 0; i < 9 ; i++) {
//            for (int j = 0; j < 9 ; j++) {
//                board[i][j] = grid[i][j];
//            }
//        }
        board = grid;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j == 2 || j == 5 || j ==8 )System.out.print(board[i][j]+"  |  ");
                else System.out.print(board[i][j]+"    ");

            }
            System.out.println();
            if(i == 2 || i == 5 || i == 8) System.out.println("----------------------------------------------");
        }
    }
    private static boolean isValid(char[][] board, int row, int col,char num) {
        //check row
        for (int i = 0; i < 9 ; i++) {
            if(board[row][i] == num)return false;
        }
        //check col
        for (int i = 0; i < 9 ; i++){
            if(board[i][col] == num)return false;
        }
        //check box 3X3
        int sRow = row/3*3;
        int sCol = col/3*3;
        for (int i = sRow; i < sRow+3; i++) {
            for (int j = sCol; j < sCol+3; j++) {
                if(board[i][j] == num)return false;
            }
        }
        return true;
    }
}
