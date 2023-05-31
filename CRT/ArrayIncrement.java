package CRT;

import java.util.Arrays;

public class ArrayIncrement {
    // ek zero initialised array hai
    // q queries ke andar L aur R de rakha h
    // L to R tak element++ karo
    // last me array btao
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0};
        int[][] q = {
                {2,5},
                {3,6}
                //{1,7}
        };
        int[] ans = modify(arr, q);
        System.out.println(Arrays.toString(ans));
    }
    static int[] modify(int[] arr, int[][] q)
    {
        int[] ans = new int[arr.length];
        ans[0] = 0;
        for(int i=0;i<q.length;i++)
        {
            ans[q[i][0]-1]++;
            ans[q[i][1]]--;
        }
        for(int i=1;i<ans.length;i++)
        {
            ans[i] = ans[i] + ans[i-1];
        }
        return ans;
    }
}

//problem -
/*
*   given a zero array, and L and R
*   but aisa rahega ki L pe 1 increment hoga uske baad L se distance increment hoga
*   jaise 2,5 diya to 2 pe 1, 3 pe 2, 4 pe 3, 5 pe 4 increment hoga
* */
