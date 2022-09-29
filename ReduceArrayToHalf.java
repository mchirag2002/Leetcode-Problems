import java.util.Arrays;

public class ReduceArrayToHalf {
//    https://leetcode.com/problems/reduce-array-size-to-the-half/
    // time limit exceeds so learn and use hashmap
    public static void main(String[] args) {
        int[] arr = {9,77,63,22,92,9,14,54,8,38,18,19,38,68,58,19};
        System.out.println(minSetSize(arr));
    }
    public static int minSetSize(int[] arr) {
        int set_count = 0;
        int[][] num = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            num[i][0] = -1;
            num[i][1] = 0;
        }
        sort(arr, 0, arr.length - 1);
        for (int i = 0, j = 0; i < arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            num[j][0] = arr[i];
            j++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==num[j][0])
                {
                    num[j][1]++;
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }
        int size = 0;
        while(true)
        {
            int max = max(num);
            if(num[max][1]+size >= arr.length/2)
            {
                set_count++;
                break;
            }
            else
            {
                size += num[max][1];
                num[max][1] = -1;
                set_count++;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(num[i]));
//        }
        return set_count;
    }
    static int max(int[][] arr)
    {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i][1] > arr[max][1])
            {
                max = i;
            }
        }
        return max;
    }

    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
}
