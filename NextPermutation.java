import java.util.Arrays;
// https://leetcode.com/problems/next-permutation/description/
public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,4};
        nextPermutation(arr);
    }
    public static void nextPermutation(int[] nums) {
        int s = 0;
        int found = 0;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                s = i-1;
                found=1;
                break;
            }
        }
        if(found==0)
        {
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            return;
        }
        int pivot = 0;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[s])
            {
                pivot = i;
                break;
            }
        }
        int temp = nums[pivot];
        nums[pivot] = nums[s];
        nums[s] = temp;
        Arrays.sort(nums, s+1, nums.length);
        System.out.println(Arrays.toString(nums));
    }

}
