import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        int arr[] = {1,2};
        System.out.println(combinationSum2(arr,4));
    }
    static List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans_main = new ArrayList<List<Integer>>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Arrays.sort(nums);
        permutation(ans_main, ans, nums, target, 0, 0);
        return ans_main;
    }
    static void permutation(List<List<Integer>> alist, List<Integer> inner, int [] arr, int target, int sum, int index)
    {
        for(int i=index;i<arr.length;i++)
        {
            if((sum+arr[i])==target)
            {
                inner.add(arr[i]);
                ArrayList<Integer> ans = new ArrayList<Integer>(inner);
                if(inner.size()!=0)
                    inner.remove(inner.size()-1);
                Collections.sort(ans);
                if(!alist.contains(ans)) {
                    alist.add(ans);
                    return;
                }
            }
            else if((sum+arr[i])>target)
            {
                return;
            }
            else
            {
                inner.add(arr[i]);
                permutation(alist, inner, arr, target, sum+arr[i], i+1);
                if(inner.size()!=0)
                    inner.remove(inner.size()-1);
                while(i<arr.length-1 && arr[i]==arr[i+1])
                {
                    i++;
                }

            }
        }
    }
}
