package CRT;

public class OddPrefixSum {
    //all possible subarrays jinka sum odd ho
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,1};
        System.out.println(countOdd(arr));
    }
    public static int countOdd(int[] arr)
    {
        //logic is ki agar final ans off chahiye
        // and khud odd hai
        // to dusra number even lagega
        // and similarly khud even hai to agla odd lagega
        int prefixSum = 0, even = 1, odd = 0, ans = 0;
        //even is 1 because prefix array is 0 initially
        for(int i=0;i<arr.length;i++)
        {
            prefixSum+= arr[i];
            if(prefixSum%2==0)
            {
                ans+=odd;
                even++;
            }
            else
            {
                ans+=even;
                odd++;
            }
        }
        return ans;
    }

}
