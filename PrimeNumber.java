public class PrimeNumber {
    //check till sqrt(N)
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        if(n<=1)
        {
            return false;
        }
        int c = 2;
        while(c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        return true;
    }
}
