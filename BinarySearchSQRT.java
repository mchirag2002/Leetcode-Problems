public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 36;
        int p = 3; //decimal places for accuracy
        System.out.printf("%.3f",sqrt(n,p));
    }
    //time complexity = O(log(n))
    public static double sqrt(int n, int p)
    {
        double root = 0.0;
        int s = 0;
        int e = n;
        while(s<=e) {
            //this loop will only give result if the number is a perfect square
            int m = s + (e - s) / 2;
            if (m * m == n) {
                return m;
            }
            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n)
            {
                root+=incr;
            }
            root -= incr;
            incr /=10;
        }
        return root;
    }
}
