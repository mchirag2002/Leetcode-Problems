public class CountBadPairs {
    public static void main(String[] args) {
        int[] nums = {4,1,3,3};
        System.out.println(countBadPairs(nums));
    }
    static long countBadPairs(int[] nums)
    {
        long count=0;
//        for (int i = 0, k = nums.length-1; i < k; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                long a = j-i;
//                long b = nums[j] - nums[i];
//                if(i<j && a!=b)
//                {
//                    count++;
//                }
//            }
//        }
        int i=0,j=0;
        while(i< nums.length && j< nums.length)
        {
            long a = j-i;
            long b = nums[j] - nums[i];

            if(i<j && a!=b)
            {
                count++;
                j++;
                if(j==nums.length)
                {
                    j=0;
                    i++;
                    continue;
                }
                continue;
            }
            else
            {
                j++;
                if(j==nums.length)
                {
                    j=0;
                    i++;
                    continue;
                }
                continue;
            }
        }
        return count;
    }
}
