public class matrix_cell_increment {
    public static void main(String[] args) {
        int m = 2, n = 2;
        int[][] indices = {{1,1},{0,0}};
        System.out.println(oddCells(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int odd = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = 0;
//            }
//        }
        for (int i = 0; i < indices.length; i++) {
            incrementCell(matrix, indices[i][0], indices[i][1]);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if( matrix[i][j]%2!=0)
                {
                    odd++;
                }
            }
        }
        return odd;
    }
    static void incrementCell(int[][] matrix, int row, int col)
    {
        for (int i = 0; i < matrix[row].length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if(i==row)
//                {
//                    matrix[i][j]++;
//                }
//                if(j==col)
//                {
//                    matrix[i][j]++;
//                }
//            }
            matrix[row][i]++;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col]++;
        }
    }

    public int oddCells_optimised(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int rowOdd = 0;
        int[] col = new int[m];
        int colOdd = 0;
        for(int[] index : indices) {
            if ((++row[index[0]] & 1) == 1) {
                ++rowOdd;
            } else {
                --rowOdd;
            }
            if ((++col[index[1]] & 1) == 1) {
                ++colOdd;
            } else {
                --colOdd;
            }
        }
        // for each row there are rowOdd odds and (n - rowOdd) evens.
        // for each col there are colOdd odds and (m - colOdd) evens.
        // each row is the same,
        // for each odd col, it turns odd cell into even cell,
        // thus kind of flips the odds and evens.
        return rowOdd * (m - colOdd) + (n - rowOdd) * colOdd;
    }
}
