import java.util.Arrays;

public class Set_matrix_zeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0)
                {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        set_zero(matrix,row,column);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    static void set_zero(int[][] matrix, int[] row, int[] column)
    {
        for (int i = 0; i < row.length; i++) {
            if(row[i]==1)
            {
                for (int j = 0; j < column.length; j++) {
                    matrix[i][j]=0;
                }
            }
            else
            {
                for (int j = 0; j < column.length; j++) {
                    if(column[j]==1)
                    {
                        matrix[i][j]=0;
                    }
                }
            }
        }
    }
}
