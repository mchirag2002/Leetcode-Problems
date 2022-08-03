public class CeilingOfNumber {
    public static void main(String[] args) {
        //ceiling of the number is the smallest number >= the target number
        int[] arr = {2, 3, 5, 9, 14 ,16 ,18};
        int target = 17;
        System.out.println(ceilingNumber(arr, target));
    }
    static int ceilingNumber(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        if(arr[arr.length-1]<target)
        {
            return -1;
        }
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            else if(arr[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return arr[start];
    }
}
