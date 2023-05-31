public class PalindromeNumberRecursion {
    public static void main(String[] args) {
        int num = 123212;
        System.out.println(pali(num));
    }
    static boolean pali(int n)
    {
        return (n==rev(n));
    }
    static int rev(int n)
    {
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }
    static int helper(int n, int digits)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}
