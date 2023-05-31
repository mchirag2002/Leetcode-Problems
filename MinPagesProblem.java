import java.util.ArrayList;

public class MinPagesProblem {
    //https://interviewbit.com/problems/allocate-books/
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(12);
        ans.add(34);
        ans.add(67);
        ans.add(90);
        System.out.println(books(ans,2));
    }
    public static int books(ArrayList<Integer> arr, int b) {
        if(arr.size()<b)
        {
            return -1;
        }
        int low = 0;
        int high = 0;

        for(int i=0;i<arr.size();i++)
        {
            high+=arr.get(i);
        }
        int ans = 0;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(isPossible(arr, mid, b))
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(ArrayList<Integer> arr, int mid, int b)
    {
        int students = 1;
        int sum = 0;
        for(int i=0;i<arr.size();i++) {
            if ((sum + arr.get(i)) <= mid) {
                sum += arr.get(i);
            } else {
                students++;
                if(students>b || mid<arr.get(i))
                    return false;
                sum = arr.get(i);
            }
        }
        if(students>b)
        {
            return false;
        }
        return true;
    }
}
