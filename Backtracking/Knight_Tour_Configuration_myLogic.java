package Backtracking;

public class Knight_Tour_Configuration_myLogic {

    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        knight(board , 0);
    }

    private static void knight(char[][] board, int row) {
        int n = board.length;
        if(row == n)
        {
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]+"    ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            return;
        }
        for(int i = 0 ; i < n ; i++)
        {
           if(isvalid(board , row , i))
           {
               board[row][i] = 'K';
               knight(board , row+1);
               board[row][i] = '.';
           }
        }
    }

    private static boolean isvalid(char[][] board, int row, int col) {
        int n = board.length;
        int i = row;
        int j = col;
        //up left && up right
        if(i >=2 && j < n-1 && j > 0)
        {
            i = i-2;
            if(board[i][j+1] == 'K' || board[i][j-1] == 'K')return false;
        }
        //left up &&left down
         i = row;
         j = col;
        if(j >= 2 && i < n-1 && i > 0)
        {
            j = j - 2;
            if(board[i+1][j] == 'K' || board[i-1][j] == 'K')return false;
        }
        //down left && down right
        i = row;
        j = col;
        if(i < n-3 && j > 0 && j < n-1)
        {
           i = i + 2;
           if(board[i][j+1] == 'K' || board[i][j-1] == 'k')return false;
        }
        //right up && right down
        i = row;
        j = col;
        if(j < n - 3 && i < n-1 && i > 0)
        {
            j = j + 1;
            if(board[i-1][j] == 'K' || board[i+1][j] == 'K')return false;
        }
        return true;
    }
}
