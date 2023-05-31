public class TargetSum {
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,1};
        System.out.println(findTargetSumWays(nums, 3));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        if(nums.length==1)
        {
            if(nums[0]!=Math.abs(target))
            {
                return 0;
            }
            return 1;
        }
        return find(nums, target, 0, 0, 0);
    }
    public static int find(int[] nums, int target, int index, int count, int sum)
    {
        if(index==nums.length)
        {
            if(sum==target)
            {
                return count+1;
            }
            else
            {
                return count;
            }
        }
        int count1 = find(nums, target, index+1, count, sum+nums[index]);
        int count2 = find(nums, target, index+1, count, sum-nums[index]);
        count+=count1 + count2;
        return count;
    }
}
