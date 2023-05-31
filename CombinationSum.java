import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> alist = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        Arrays.sort(candidates);
        permutation(alist, innerList, candidates, target, 0);
        return alist;
    }
    static void permutation(List<List<Integer>> alist, List<Integer> inner, int [] arr, int target, int sum)
    {
        int n = inner.size();
        for(int i=0;i<arr.length;i++)
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
                permutation(alist, inner, arr, target, sum+arr[i]);
                if(inner.size()!=0)
                    inner.remove(inner.size()-1);

            }
        }
    }

}
