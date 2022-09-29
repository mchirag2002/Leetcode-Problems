public class searchInRotatedArray {
//    https://leetcode.com/problems/search-in-rotated-sorted-array/
    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(num, target));
    }
    public static int search(int[] nums, int target) {
        int peak = pivot(nums);
        if(peak==-1)
        {
            //it means peak does not exist
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        int first = binarySearch(nums, target, 0, peak);
        if(first != -1)
        {
            return first;
        }
        else
        {
            return binarySearch(nums, target, peak+1, nums.length-1);
        }
    }
    static int binarySearch(int[] nums, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] > target)
            {
                end = mid-1;
            }
            else if(nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }

        return -1;
    }
    //this will not work with duplicate values in the array
    static int pivot(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid+1])
            {
                return mid;
            }
            if(start < mid && nums[mid-1] > nums[mid])
            {
                return mid-1;
            }
            if(nums[mid]<=nums[start])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }

    static int pivotWithDuplicates(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid+1])
            {
                return mid;
            }
            if(start < mid && nums[mid-1] > nums[mid])
            {
                return mid-1;
            }
            if(nums[mid] == nums[start] && nums[mid] == nums[end])
            {
                //skip these elements
                //check if start is the pivot
                if(nums[start] > nums[start+1])
                {
                    return start;
                }
                start++;
                //check if end is the pivot
                if(nums[end] < nums[end-1])
                {
                    return end-1;
                }
                end--;
            }
            //if not found till now, the pivot is in right side and left side is sorted
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end]))
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
