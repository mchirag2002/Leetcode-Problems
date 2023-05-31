public class CountZeroes {
    public static void main(String[] args) {
        int num = 1020304;
        System.out.println(count(num));
    }

    static int count(int num) {
        int c = 0;
        return helper(num,c);
    }
    static int helper(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
        int rem = n%10;
        if(rem==0)
        {
            return helper(n/10,++c);
        }
        return helper(n/10,c);
    }
}
