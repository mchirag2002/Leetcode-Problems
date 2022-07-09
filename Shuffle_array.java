import java.util.Arrays;

public class Shuffle_array {
    public static void main(String[] args) {
        //Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
        //Return the array in the form [x1,y1,x2,y2,...,xn,yn].
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] arr = new int[nums.length];
        for (int i = 0, j=0; j < nums.length; i++, j++) {
            arr[j] = nums[i];
            j++;
            arr[j] = nums[i+n];
        }
        System.out.println(Arrays.toString(arr));
    }
}
