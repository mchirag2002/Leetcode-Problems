package CRT;

import java.util.Arrays;

public class MinElement2DArray {
    //2D prefix minimum where top left corner fixed at (1, 1)
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,1},
                {2,2,1},
                {1,2,3}
        };
        int[][] pref = new int[arr.length+1][arr[0].length+1];
        for(int i=0;i<pref.length;i++)
        {
            pref[i][0] = Integer.MAX_VALUE;
            pref[0][i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i <= arr.length; i++) {
            for(int j = 1; j <= arr[0].length; j++)
            {
                int a = Math.min(pref[i-1][j],pref[i][j-1]);
                pref[i][j] = Math.min(a,arr[i-1][j-1]);
            }
        }
        for (int[] a:pref) {
            System.out.println(Arrays.toString(a));
        }
    }
}
