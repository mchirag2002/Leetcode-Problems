package CRT;

public class LongestSubarraySum {
    //longest subarray having sum less than equals to k
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 2, 0, 0, 1};
        int k = 6;

        System.out.println(countSubPrefix(arr, k));
        System.out.println(countSubSliding(arr, k));
    }

    public static int countSubPrefix(int[] arr, int k)
    {
        //logic -
        // length of the subarray ke upar binary search lagaya hai
        // ki length 1, 2, 3, 4, ... n hai to usme se jaise 1 length ki arrays pe exist kar rahi h kya
        // then 2 pe...aise iterate krte krte we go to the maximum value jiske liye atleast one subarray exist kar rahi h
        // jiska mtlb hoga ki us length ke liye ek subarray exist krti hai jiska sum<=k hai.

        //complexity = O(n+logn*n)
        //              O(n + nlogn)

        // yaha pe humko binary search lagane ke liye monotonicity dhundhni hoti hai
        // to jaise length ki monotonicity thi to humne uska co-relation nikala
        // aur fir uske baad binary search apply kiya

        int[] pref = new int[arr.length + 1];
        for (int i = 1; i <= arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i - 1];
        }
        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (thisIsYes(pref, mid, arr.length, k)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static int countSubSliding(int[] arr, int k)
    {
        int lo = 0;
        int hi = arr.length - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isThisYes(arr, mid, k)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    static boolean thisIsYes(int[] pref, int mid, int n, int k) {
        for (int ep = 1; ep <= n; ep++) {
            int sp = ep - mid + 1;
            if (sp < 1) {
                continue;
            }
            if (pref[ep] - pref[sp - 1] <= k) {
                return true;
            }
        }
        return false;
    }

    static boolean isThisYes(int[] arr, int mid, int k)
    {
        int sum=0;
        for(int i=1;i<=mid;i++)
        {
            sum+=arr[i];
        }
        for(int ep=mid+1;ep<arr.length;ep++)
        {
            int sp = ep-mid+1;
            sum = sum + arr[ep] - arr[sp-1];
            if(sum<=k)
                return true;
        }
        return false;
    }
}
