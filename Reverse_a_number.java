public class Reverse_a_number {
    //there are a lot of ways to do it by recursion
    static int sum = 0;
    static void rev1(int n)
    {
        if(n==0)
        {
            return;
        }
        int rem = n%10;
        sum  = sum*10 + rem;
        rev1(n/10);
    }
    public static int rev2(int n)
    {
        int digits = (int)Math.log10(n) + 1; //this gives the number of digits in a single line
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n)
        {
            return n;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }

    public static void main(String[] args) {
        int num = 32468;
        rev1(num);
        System.out.println(sum+"");
        System.out.println(rev2(num));
    }
}
