public class matrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(diagonalSum(matrix));
    }
    static int diagonalSum(int[][] mat) {
        int size = mat.length-1;
        int sum = 0;
        for (int i = 0; i <= size; i++) {
            sum+=mat[i][i] + mat[i][size-i];
        }
//        System.out.println(sum);
        if(size%2==0)
        {
            sum = sum - mat[size/2][size/2];
        }
        return sum;
    }
}
