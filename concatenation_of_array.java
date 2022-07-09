import java.util.Arrays;

public class concatenation_of_array {
    public static void main(String[] args) {
        //the goal is to concatenate the nums array to itself...double kardo
        int[] nums = {1,2,1};
        int[] ans = new int[2* nums.length];
        for(int i=0; i< nums.length; i++)
        {
            ans[i] = nums[i];
            ans[i+ nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
