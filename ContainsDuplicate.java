public class ContainsDuplicate {
//    https://leetcode.com/problems/contains-duplicate-iii/
    public static void main(String[] args) {
        int[] arr = {-2147483648,2147483647};
        int k=1, t=1;
        System.out.println(containsNearbyAlmostDuplicate(arr, k ,t));
        System.out.println(Math.abs(-45));
    }
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                long a = nums[i];
                long b = nums[j];
                long sum = a - b;
                if(Math.abs(sum) <= t && Math.abs(i-j) <= k)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
