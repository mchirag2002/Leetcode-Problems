import java.util.*;
public class RepeatAndMissing {
    public static void main(String[] args) {
        final int arr[] = {2,2};
        Arrays.sort(arr);
        final ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(2);
        ans.add(3);
        ans.add(2);
        Collections.sort(ans);
        System.out.println(ans);
//        System.out.println(Arrays.toString(arr));
        System.out.println(repeatedNumber(arr));
    }
    public static ArrayList<Integer> repeatedNumber(final int arr[]) {
        int repeat = 0;
        int missing = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                repeat = arr[i];
                break;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            missing = missing^arr[i];
        }
        for(int i=1;i<=arr.length;i++)
        {
            missing = missing^i;
        }
        missing = missing^repeat;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(repeat);
        ans.add(missing);
        return ans;
    }
}
