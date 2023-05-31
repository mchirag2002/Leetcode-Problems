import java.util.ArrayList;

public class PermutationSequence {
    public static void main(String[] args) {
        System.out.println(getPermutation(4,9));
//        System.out.println(fact(5));
    }
    public static String getPermutation(int n, int k)
    {
        ArrayList<Integer> num = new ArrayList<Integer>();
        String ans = "";
        if(n==1)
        {
            ans+=n+"";
            return ans;
        }
        k--;
        for(int i=1;i<=n;i++)
        {
            num.add(i);
        }
        while(true)
        {
            if(num.size()==1)
            {
                ans+=num.get(0)+"";
                break;
            }
            int partition = fact(num.size()-1);
            int i = k/partition;
            ans+=num.get(i)+"";
            num.remove(i);
            k=k%partition;
        }
        return ans;
    }
    static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}
