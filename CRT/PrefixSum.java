package CRT;

import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {-1,-1,1};
        int pre[] = preSum(arr);
        //System.out.println(Arrays.toString(pre));
        //System.out.println(prefixSubarray(arr, 2,4));
        //preSumSubarray(arr, 4, 7);
        //System.out.println(countTargetSum(arr, pre, 6, 7));
        System.out.println(countTargetSum(arr, pre, 0));
    }

    public static int[] preSum(int[] arr)
    {
        // simply finds the prefix array
        int pre[] = new int[arr.length+1];
        pre[0] = 0;
        for(int i=1;i<pre.length;i++)
        {
            pre[i] = pre[i-1] + arr[i-1];
        }
        return pre;
    }

    public static int prefixSubarray(int[] arr, int l, int r)
    {
        //return the sum of the sub array given one based indexing
        int[] pre = preSum(arr);
        return pre[r]-pre[l-1];
    }

    public static void preSumSubarray(int[] arr, int index, int sum)
    {
        //return the largest subarray ending at index and having the given sum
        //to optimize this solution, we can store the first occurrence of each sum in a hashmap
        int[] pre = preSum(arr);
        int l=0, start = 0;
        int p = pre[index] - sum;
        for(;l<index;l++)
        {
            if(pre[l]==p)
            {
                start = l;
                break;
            }
        }
        for(int i=start;i<index;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int countTargetSum(int[] arr, int[] pre, int index, int target)
    {
        int p = pre[index] - target;
        HashMap<Integer, Integer> m = new HashMap<>();//stores count
        for (int i = 0; i < pre.length; i++) {
            int count = m.getOrDefault(pre[i],0);
            m.put(pre[i], count+1);
        }
        System.out.println(m);
        return m.getOrDefault(p,0);
    }

    public static int countTargetSum(int[] arr, int[] pre, int target)
    {
        int count = 0;
        for(int i=0;i<pre.length;i++)
        {
            count+=countTargetSum(arr, pre, i, target);
        }
        return count;
    }
}


