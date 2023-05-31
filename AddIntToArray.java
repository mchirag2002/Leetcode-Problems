import java.util.*;

public class AddIntToArray {
    public static void main(String[] args) {
//        int arr[] = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int arr[] = {2,1,5};
        System.out.println(addToArrayForm(arr,806));
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=num.length-1;i>=0;i--)
        {
            ans.add(0,(num[i]+k)%10);
            k = (num[i]+k)/10;
        }
        if(k!=0)
        {
            while(k>0)
            {
                ans.add(0,k%10);
                k= k/10;
            }
        }
        return ans;
    }
}
