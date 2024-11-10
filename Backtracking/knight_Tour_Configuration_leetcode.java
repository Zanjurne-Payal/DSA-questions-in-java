package Backtracking;
//problem no 2596
public class knight_Tour_Configuration_leetcode {
    public static void main(String[] args) {
        int[][] grid = {{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        for(int i = 0 ; i < grid.length ; i++)
        {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j]+"     ");
            }
            System.out.println();
        }
        System.out.println(checkValid(grid));
    }

    private static boolean checkValid(int[][] grid) {
        if(grid[0][0] != 0)return false;
        return helper(grid,0,0,0);
    }

    private static boolean helper(int[][] grid, int row, int col, int num) {
        int n = grid.length;
        if(num == ((n*n)-1))
        {
            return true;
        }
        //up -left
        int i = row-2;
        int j = col-1;
        if(i >= 0 && j >= 0 && grid[i][j] == num+1)
        {
            return helper(grid , i , j , num+1);
        }
        //up-right
        i = row-2;
        j = col+1;
        if(i >= 0 && j < n && grid[i][j] == num+1)
        {
            return helper(grid , i , j , num+1);
        }
        //down-left
        i = row+2;
        j = col-1;
        if(i < n && j >= 0 && grid[i][j] == num+1)
        {
            return helper(grid , i , j , num+1);
        }
        //down-right
        i = row+2;
        j = col+1;
        if(i < n  && j < n && grid[i][j] == num+1)
        {
            return helper(grid , i , j , num+1);
        }
        //left-up
        i = row-1;
        j = col-2;
        if(i >= 0 && j >= 0 && grid[i][j] == num+1)
        {
            return helper(grid , i , j , num+1);
        }
        // left-down
        i = row+1;
        j = col-2;
        if(i < n && j >= 0 && grid[i][j] == num+1)
        {
            return helper(grid , i , j , num+1);
        }
        //right-up
        i = row-1;
        j = col+2;
        if(i >= 0 && j < n && grid[i][j] == num+1)
        {
            return helper(grid , i , j , num+1);
        }
        //right-down
        i = row+1;
        j = col+2;
        if(i < n && j < n && grid[i][j] == num+1)
        {
            return helper(grid , i , j , num+1);
        }
        return false;
    }
}
