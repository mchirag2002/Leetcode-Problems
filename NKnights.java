public class NKnights {
    public static void main(String[] args) {
        int n=2;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, n);
        System.out.println(knightCount(board, 0, 0, n));
    }
    static void knight(boolean[][] board, int row, int col, int knights)
    {
        if(knights==0)
        {
            display(board);
            System.out.println();
            return;
        }
        if(row == board.length-1 && col == board.length)
        {
            return;
        }

        if(col== board.length)
        {
            knight(board, row+1, 0, knights);
            return;
        }
        if(isSafe(board, row, col))
        {
            board[row][col] = true;
            knight(board, row, col+1, knights-1);
            board[row][col] = false;
        }
        knight(board, row, col+1, knights);
    }

    static int knightCount(boolean[][] board, int row, int col, int knight)
    {
        if(knight==0)
        {
            return 1;
        }
        if(row == board.length-1 && col == board.length)
        {
            return 0;
        }
        int count=0;
        if(col== board.length)
        {
            count += knightCount(board, row+1, 0, knight);
            return count;
        }
        if(isSafe(board, row, col))
        {
            board[row][col] = true;
            count += knightCount(board, row, col+1, knight-1);
            board[row][col] = false;
        }
        count+= knightCount(board, row, col+1, knight);
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board, row-2, col+1))
        {
            if(board[row-2][col+1])
            {
                return false;
            }
        }
        if(isValid(board, row-2, col-1))
        {
            if(board[row-2][col-1])
            {
                return false;
            }
        }
        if(isValid(board, row -1, col+2))
        {
            if(board[row-1][col+2])
            {
                return false;
            }
        }
        if(isValid(board, row-1, col-2))
        {
            if(board[row-1][col-2])
            {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col)
    {
        if(row >= 0 && row < board.length && col >= 0 && col < board.length)
            return true;
        return false;
    }

    private static void display(boolean[][] board) {
        for(int i=0;i< board.length;i++)
        {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j])
                {
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
