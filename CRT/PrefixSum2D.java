package CRT;

import java.util.Arrays;

public class PrefixSum2D {
    //the value of prefix matrix cell at i,j contains the sum of all values
    // in the matrix starting from 1,1 to i,j
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,1},
                {2,2,1},
                {1,2,3}
        };
        NumMatrix s = new NumMatrix(arr);
        System.out.println(s.sumRegion(1,1,2,2));
        // code to build
        // pref(i,j) = pref(i-1,j) + pref(i,j-1) - pref(i-1,j-1) + arr[i,j] recursive call

        //submatrix(x1,y1,x2,y2) = pref(x2,y2) - pref(x2,y1-1) - pref(x1-1,y2) + pref(x-1,y-1)
    }

}
class NumMatrix {

    int[][] pref;
    public NumMatrix(int[][] matrix) {
        pref = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                pref[i][j] = pref[i - 1][j] + pref[i][j - 1] - pref[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
//        for(int i=0;i<=pref.length;i++)
//        {
//            System.out.println(Arrays.toString(pref[i]));
//        }
    }
    public int sumRegion(int x1, int y1, int x2, int y2) {
        x1++;
        x2++;
        y1++;
        y2++;
        return pref[x2][y2] - pref[x2][y1-1] - pref[x1-1][y2] + pref[x1-1][y1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
