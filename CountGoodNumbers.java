import java.util.ArrayList;

public class CountGoodNumbers {
    //https://leetcode.com/problems/count-good-numbers/description/
    public static void main(String[] args) {
        long n = 4;
        System.out.println(countGoodNumbers(n));
    }
    public static long mod = 1000000000+7;
    public static int countGoodNumbers(long n) {
        long odd = (n/2);
        long even = (n+1)/2;
        return (int)((pow(5,even)*pow(4,odd))%mod);
    }

    public static long pow(long x, long n) {
        if(n==0)
        {
            return 1;
        }
        long ans = pow(x,n/2);
        if(n%2==0)
        {
            return (ans*ans)%mod;
        }
        else
        {
            return (x*ans*ans)%mod;
        }
    }
    public int unvisitedLeaves(int n, int leaves, int frogs[]) {
        // Code here
        ArrayList<Integer> count = new ArrayList<Integer>();
        for(int i=1;i<=leaves;i++)
        {
            count.add(i);
        }
        for(int i=0;i<frogs.length;i++)
        {
            int jump = frogs[i];
            int j=0;
            while(j<=leaves)
            {
                count.remove(Integer.valueOf(j));
                j+=jump;
            }
        }
        return count.size();
    }
}
