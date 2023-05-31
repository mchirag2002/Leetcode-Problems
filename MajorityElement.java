import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1};
        System.out.println(majotrity(arr));
    }
    static int majotrity(int nums[])
    {
        Arrays.sort(nums);
        int count = 1;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(count>(nums.length/2))
            {
                return nums[i];
            }
            if(nums[i+1]==nums[i])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if(count>(nums.length/2))
            {
                return nums[i];
            }
        }
        return -1;
    }

}
