import java.util.Arrays;

public class DiagonalNumber {

    // you are given a n*n matrix in which the elements 1 - n^2 are filled in sorted order diagonally
    /*
    *              1   3   6   10  15
    *           1  2   5   9   14  19
    *           2  4   8   13  18  22
    *           3  7   12  17  21  24
    *           4  11  16  20  23  25
    *           5     6   7   8   9
    * */
    // you are provided with an integer n and a set of q queries
    // for each query you have to return the number of diagonal in which that number exists

    public static void main(String[] args) {
        long[] query = {1,16,25};
        int[] ans = solve(5,query.length,query);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] solve(int n, int q, long[] query)
    {
        int[] ans = new int[q];
        for(int i=0;i<q;i++)
        {
            long x = query[i];
            long start = 1;
            long end = 2*n-1;
            boolean flag = false;
            long a = (long)((n+1)*n)/2;
            if(x>a)
            {
                x = (long)n*n - x +1;
                flag = true;
            }
            while(start<=end)
            {
                long mid = start + (end - start)/2;
                long dStart = (mid-1)*mid/2+1;
                long dEnd = (mid+1)*mid/2;
                if(x<dStart)
                {
                    end = mid-1;
                }
                else if(x>dEnd)
                {
                    start = mid+1;
                }
                else
                {
                    if(flag)
                    {
                        mid = 2*n - mid;
                    }
                    ans[i] = (int)mid;
                    break;
                }
            }
        }
        return ans;
    }

}
