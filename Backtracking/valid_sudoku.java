//Leetcode problem no 36
// 9 X 9 matrix
package Backtracking;

public class valid_sudoku {
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
        System.out.println(sudoku(board));
    }

    private static boolean sudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.')continue;
                char num = board[i][j];
                board[i][j] = '.';
                if(!isValid(board, i, j, num))return false;
                board[i][j] = num;
            }
        }
        return true;
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
