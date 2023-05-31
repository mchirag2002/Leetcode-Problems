public class SudokuSolver {
    public static void main(String[] args) {

    }

    static boolean sudoku(int[][] board)
    {
        //first find the empty elements
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean empty = false;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==0)
                {
                    row=i;
                    col=j;
                    empty = true;
                    break;
                }
            }
            if(empty == true)
                break;
        }
        if(empty == false)
        {
            return true; //sudolu is solved as there is no more empty space
        }

        for(int number = 1; number < n; number++)
        {
            if(isSafe(board, row, col, number))
            {
                board[row][col] = number;
                if(sudoku(board))
                {
                    return true;
                }
                else
                {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board, int row, int col, int num)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==num)
            {
                return false;
            }
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col] == num)
            {
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for(int i=rowStart;i<rowStart+sqrt;i++)
        {
            for(int j=colStart;j<colStart+sqrt;j++)
            {
                if(board[i][j]==num)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
