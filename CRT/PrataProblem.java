package CRT;

import java.util.HashMap;
import java.util.Scanner;

public class PrataProblem {
    //https://www.spoj.com/problems/PRATA/
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            int order = in.nextInt();
            int size = in.nextInt();
            int[] arr = new int[size];
            for(int j=0;j<size;j++)
            {
                arr[j] = in.nextInt();
            }
            int ans = solve(arr, order);
            System.out.println(ans);
        }
    }
    
    public static int solve(int[] arr, int order)
    {
        int low = 1;
        int high = Integer.MAX_VALUE;
        int ans = -1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            int totalParantha = 0;
            for(int i=0;i<arr.length;i++)
                totalParantha += calculate(arr[i], mid, order);
            if(totalParantha<order)
            {
                low = mid+1;
            }
            else
            {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }

    public static int calculate(int power, int time, int order)
    {
        //check ki time ke andar kitne max paranthe bangenge
        long low = 0;
        long high = order;
        int per = 0;
        while (low <= high) {
            int mid = (int) (low + (high - low) / 2);
            int p = power * mid * (mid + 1) / 2;
            if (p <= time) {
                per = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return per;
    }

}
