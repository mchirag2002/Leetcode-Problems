public class findInMountain {
//    https://leetcode.com/problems/find-in-mountain-array/
    //also called the bitonic array
    public static void main(String[] args) {
        int[] arr = {1, 5, 2};
        int target = 2;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target)
    {
        int peak = peakIndexInMountainArray(arr);
        int first = orderAgnosticBS(arr, target, 0, peak);
        int last = 0;
        if(first==-1)
        {
            last = orderAgnosticBS(arr, target, peak+1, arr.length-1);
            return last;
        }
        return first;
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

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
