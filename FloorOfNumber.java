public class FloorOfNumber {
    public static void main(String[] args) {
        //the largest number that is <= target element
        int[] arr = {1,3,5,7,9,15,17,26};
        System.out.println(floorNumber(arr, 14));
    }
    static int floorNumber(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        if(arr[0]>target)
        {
            return -1;
        }
        while(start <= end)
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
        return arr[end];
    }
}
