package CRT;

import java.util.HashMap;

public class MaxCandyDistribution {
    public static void main(String[] args) {
        int[] candies = {5,8,6};
        long k = 3;
        System.out.println(maximumCandies(candies,k));
    }
    public static int maximumCandies(int[] candies, long k) {
        long low = 1;
        long sum =0;
        for(int i=0;i<candies.length;i++)
        {
            sum+=candies[i];
        }
        long high = sum/k;
        long ans = 0;
        while(low<=high)
        {
            long mid = low + (high-low)/2;
            long possible =0;
            for(int i=0;i<candies.length;i++)
            {
                possible+=candies[i]/mid;
            }
            if(possible>=k)
            {
                ans = mid;
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return (int)ans;
    }
}
