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

}
