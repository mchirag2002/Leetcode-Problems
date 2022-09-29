public class InfiniteArray {
//    https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target)
    {
        //first find the range
        //first start with the range size of 2 and then move on to doubling the size
        //reverse of binary search
        int start = 0;
        int end = 1;
        int size = 2;
        while(target > arr[end])
        {
            start = end+1;
            size*=2;
            end = end+size;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end)
    {
        while(start <= end)
        {
//            int mid = (start + end)/2;
//            this method is not efficient because start+end can sometimes exceed the limit of the integer range
            int mid = start + (end - start)/2;
            //this is the more efficient method
            if(arr[mid] < target)
            {
                start = mid+1;
            }
            else if(arr[mid] > target)
            {
                end = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
