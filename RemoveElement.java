import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        System.out.println(removeElement(a, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
