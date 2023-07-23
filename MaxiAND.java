import java.util.Arrays;

public class MaxiAND {
    public static void main(String[] args) {
        int[] a = {1,3,5,8};
        System.out.println(maxiAnd(a.length,a));
    }
    static long maxiAnd(int n, int []a) {
        // Write your code here.
        long ans = replace(a[0]);
        for(int i=1;i<n;i++)
        {
            a[i] = replace(a[i]);
            ans = ans&a[i];
        }
        System.out.println(Arrays.toString(a));
        return ans;
    }
    static int replace(int n)
    {
        int i=0;
        while(n>=Math.pow(2,i))
        {
            i++;
        }
        return (int)Math.pow(2,i)-1;
    }
}
