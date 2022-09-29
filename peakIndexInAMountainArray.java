public class peakIndexInAMountainArray {
//    https://leetcode.com/problems/peak-index-in-a-mountain-array/
    //also called the bitonic array
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
//            int mid = (start + end)/2;
//            this method is not efficient because start+end can sometimes exceed the limit of the integer range
            int mid = start + (end - start)/2;
            //this is the more efficient method
            if(arr[mid] < arr[mid+1])
            {
                //you are in the asc part of the array
                start = mid+1;
                //because we know that mid+1 > mid
            }
            else
            {
                //you are in the desc part of the array
                //this maybe the ans, but look at your left
                //hence end != mid-1
                end = mid;
            }
        }
        //in the end start == end because of the checks above
        //because the end and start are trying to find the largest element and
        //when they are pointing to only one element then that will be the largest one only
        return start;
    }
}
