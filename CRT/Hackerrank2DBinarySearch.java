package CRT;

public class Hackerrank2DBinarySearch {
    // max area of square-submatrix having sum<=k
    public static void main(String[] args) {
        int[][] arr = {
                {2,1,3,2},
                {2,3,2,1},
                {1,3,4,1},
                {4,1,2,3}
        };
        System.out.println(maxArea(arr, 10));
    }
    public static int maxArea(int[][] arr, int k)
    {
        int[][] pref = new int[arr.length+1][arr[0].length+1];
        for(int i=1;i<=arr.length;i++)
        {
            for(int j=1;i<=arr[0].length;j++)
            {
                pref[i][j] = pref[i - 1][j] + pref[i][j - 1] - pref[i - 1][j - 1] + arr[i - 1][j - 1];
            }
        }
        int lo = 0, hi = arr.length-1, ans = -1;
        while(lo<=hi)
        {
            int mid = lo + (hi - lo)/2;
            if(isThisYes(pref, mid, k))
            {
                ans = mid;
                lo = mid+1;
            }
            else
            {
                hi = mid-1;
            }
        }
        return ans*ans;
    }
    static boolean isThisYes(int[][] pref, int mid, int k)
    {
        for(int i=1;i< pref.length;i++)
        {
            for(int j=1;j< pref.length;j++)
            {
                int sp = i-mid-1, ep = j-mid-1;
                if(sp<=0 || ep<=0)
                    continue;
                int sum = pref[i][j] - pref[sp-1][j] - pref[i][ep-1] + pref[sp-1][ep-1];
                if(sum<=k)
                    return true;
            }
        }
        return false;
    }
}
