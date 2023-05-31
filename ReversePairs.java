public class ReversePairs {
    public static void main(String[] args) {
        int arr[] = {-5,-5};
        System.out.println(pair(arr));
    }
    static int reverse(int[] nums)
    {
        int pairs = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                float a = (nums[i]);
                a = a/2;
                if(a>(float)nums[j])
                {
                    pairs++;
                }
            }
        }
        return pairs;
    }
    static int pair(int[] nums)
    {
        int pairs = 0;
        for(int i=0,j=1;i<nums.length;j++)
        {
            if(j==nums.length)
            {
                i++;
                j=i;
                continue;
            }
            float a = (nums[i]);
            a = a/2;
            if(a>(float)nums[j])
            {
                pairs++;
            }
        }
        return pairs;
    }
}
