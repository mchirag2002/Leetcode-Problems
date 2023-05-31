public class SieveOfEratosthenes {
    public static void main(String[] args) {
        //start from 2 aur n number tak 2 ke saare multiples cross out kardo
        //then do the same thing with 3, 4, 5 till sqrt(n)
        //by the time you reach sqrt(n) you would have only the prime numbers left as unchecked

        //by taylor series harmonic progression, we can calculate that
        //time complexity = O(N*log(log(N)))
        //space complexity = O(N)
        int n=100;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }
    public static void sieve(int n, boolean[] primes)
    {
        for (int i = 2; i*i < n; i++) {
            if(!primes[i])
            {
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(!primes[i])
            {
                System.out.println(i);
            }
        }
    }
}
