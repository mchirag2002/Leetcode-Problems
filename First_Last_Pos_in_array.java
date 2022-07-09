import java.util.Arrays;

public class First_Last_Pos_in_array {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,12};
        int target = 8;
        int[] out = {-1,-1};
        for(int i=0; i< nums.length; i++)
        {
            if(out[0]==-1)
            {
                if(nums[i]==target)
                {
                    out[0]=i;
                }
            }
            else
            {
                if(nums[i]==target)
                {
                    out[1]=i;
                }
            }
        }
        if(out[1]==-1)
        {
            out[1]=out[0];
        }
        System.out.println(Arrays.toString(out));
    }
}
