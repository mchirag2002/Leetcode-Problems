package CRT;

public class KokoEatBanana {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        System.out.println(minEatingSpeed(arr, 8));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MAX_VALUE;
        int ans = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int time = timeTaken(piles, mid);
            if(time>h)
            {
                low = mid+1;
            }
            else
            {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
    public static int timeTaken(int[] arr, int speed)
    {
        int time = 0;
        for(int i=0;i<arr.length;i++)
        {
            time += (arr[i]+speed-1)/speed;
        }
        return time;
    }
}
