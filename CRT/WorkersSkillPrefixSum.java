package CRT;

import java.util.*;

public class WorkersSkillPrefixSum {
    public static void main(String[] args) {
        int[] odd = {1,3,7,10,12};
        int[] even = {2,3,1,5};
//        System.out.println(minCost(odd));
//        System.out.println(easyMinCost(even));
        System.out.println(minCostOptimized(odd));
    }

    public static int easyMinCost(int[] arr)
    {
        //in this, we are given even number of values, and we have to calculate the min cost
        Arrays.sort(arr);
        int cost = 0;
        for (int i = 0; i < arr.length; i+=2) {
            cost += Math.abs(arr[i] - arr[i+1]);
        }
        return cost;
    }

    public static int easyMinCostSkip(int[] arr, int index)
    {
        //helper function
        //in this, we are given even number of values, and we have to calculate the min cost
        int cost = 0;
        for (int i = 0; i < arr.length; i+=2) {
            if(i==index)
            {
                i--;
            }
            else if(i==index-1)
            {
                cost+= Math.abs(arr[i] - arr[i+2]);
                i++;
            }
            else {
                cost += Math.abs(arr[i] - arr[i + 1]);
            }
        }
        return cost;
    }

    public static int minCost(int[] arr)
    {
        // we are given odd number of people and one will be left out
        // minimize the cost again
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            min = Math.min(min, easyMinCostSkip(arr,i));
        }
        return min;
    }

    public static int minCostOptimized(int[] arr)
    {
        Arrays.sort(arr);
        int[] diffpref = new int[arr.length];
        int[] diffsuf = new int[arr.length];
        for(int i=1;i<arr.length;i++)
        {
            if(i%2!=0)
            {
                diffpref[i] = diffpref[i-1] + arr[i] - arr[i-1];
            }
            else
            {
                diffpref[i] = diffpref[i-1];
            }
        }
        for(int i=arr.length-2;i>=0;i--)
        {
            if(i%2!=0)
            {
                diffsuf[i] = diffsuf[i+1] + arr[i+1] - arr[i];
            }
            else
            {
                diffsuf[i] = diffsuf[i+1];
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                if(i==0 || i==arr.length-1)
                {
                    continue;
                }
                ans = Math.min(ans, diffpref[i-1]+diffsuf[i+1]);
            }
            else
            {
                ans = Math.min(ans, diffpref[i-1]+diffsuf[i+1] + (arr[i+1]-arr[i-1]));
            }
        }
        return 0;
    }
}
