package CRT;

import java.util.*;

//google oa
public class MaxValidSubarray {
    // given 2 corresponding arrays first is binary and second has normal elements
    // valid subarray is the one where first ka sum zero ho and second ka sum max ho
    public static void main(String[] args) {
        int[] first = {0,1,-1,1,1,-1,1,1,-1};
        int[] second = {0,1,2,-1,2,-2,3,3,1};
        //return the max sum first for a certain index
        System.out.println(sumOfValidSubarray(first, second, 8));
        System.out.println(maxPossibleSum(first, second));
    }
    public static int sumOfValidSubarray(int[] first, int[] second, int index)
    {
        PrefixSum p = new PrefixSum();
        int[] pre1 = p.preSum(first);
        int[] pre2 = p.preSum(second);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<index;i++)
        {
            if(pre1[i]==pre1[index+1])
            {
                min = Math.min(min, pre2[i]);
            }
        }
        return pre2[index+1] - min;
    }
    public static int maxPossibleSum(int[] first, int[] second)
    {
        PrefixSum p = new PrefixSum();
        int[] pre1 = p.preSum(first);
        int[] pre2 = p.preSum(second);
        int ans = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0,0);
        for(int i=1;i<pre1.length;i++)
        {
            if(m.containsKey(pre1[i])) {
                ans = Math.max(ans, pre2[i] - m.get(pre1[i]));
                if(m.get(pre1[i])>pre2[i])
                    m.put(pre1[i],pre2[i]);
            }
            else
            {
                m.put(pre1[i],pre2[i]);
            }
        }
        return ans;
    }
}
