import java.util.*;

public class Sum4 {
    public static void main(String[] args) {
        int nums[] = {0,1,-1,0,-2,2};
        System.out.println(fourSum(nums, 0));
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0, j=nums.length-1;i<j;i++,j--)
        {
            for(int x=i+1, y=j-1;x<y;x++,y--)
            {
                List<Integer> temp = new ArrayList<Integer>();
                if((nums[i]+nums[j]+nums[x]+nums[y])==target)
                {
                    temp.add(nums[i]);
                    temp.add(nums[x]);
                    temp.add(nums[y]);
                    temp.add(nums[j]);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
