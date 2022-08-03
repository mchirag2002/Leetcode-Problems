public class Contest_9July22_q1 {
    public static void main(String[] args) {
        int[] nums1 = {1,4,10,12};
        int[] nums2 = {5,8,6,9};
        int k1,k2;
        k1=1;
        k2=1;

        int[] min = new int[2];
        min[0] = mod(nums1[0] - nums2[0]);
        min[1] = 0;
        int[] min2 = new int[2];
        int[] diff1 = new int[k1];
        int[] diff2 = new int[k2];
        for (int i = 0; i < diff1.length; i++) {
            diff1[i] = 0;
        }
        for (int i = 0; i < diff1.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (min[0]>mod(nums1[j]-nums2[j]))
                {
                    min[0] = mod(nums1[j]-nums2[j]);
                    min[1] = j;
                }
            }
                nums1[min[1]]++;

        }
        if(min[1]==0)
        {
            min2[0] = mod(nums1[1]-nums2[1]);
            min2[1] = 1;
        }
        else
        {
            min2[0] = mod(nums1[0]-nums2[0]);
            min2[1] = 0;
        }
        for (int i = 0; i < diff2.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(min[1]==j)
                {
                    continue;
                }
                if (min2[0]>mod(nums1[j]-nums2[j]))
                {
                    min2[0] = mod(nums1[j]-nums2[j]);
                    min2[1] = j;
                }
            }
                nums2[min2[1]]++;

            }
        long sum = 0;
        for (int i = 0; i < nums1.length; i++) {
            sum += (nums1[i] - nums2[i])*(nums1[i] - nums2[i]);
        }
        System.out.println(sum);
    }
    static int mod(int n)
    {
        if(n<0)
        {
            n = -n;
        }
        return n;
    }
}
