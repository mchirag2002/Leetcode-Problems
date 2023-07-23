import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class EkoProblem {
    //https://www.spoj.com/problems/EKO/
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        long n = in.nextLong();
        long m = in.nextLong();
        long largest = 0;
        ArrayList<Long> trees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            trees.add(in.nextLong());
            if (largest < trees.get(i)) {
                largest = trees.get(i);
            }
        }
        System.out.println(solve(n, trees, m, largest));
    }

    public static long solve(long n, ArrayList<Long> trees, long m, long high) {
        //Collections.sort(trees);
        long low = 0;
        long ans = -1;
//        long high = trees.get(trees.size()-1);
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long cut = compute(trees, mid, n);
            if (cut < m) {
                high = mid - 1;
            } else if (cut == m) {
                ans = mid;
                break;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }

    public static long compute(ArrayList<Long> trees, long cut, long n) {
        long removed = 0;
        for (int i = 0; i < n; i++) {
            if (trees.get(i) > cut) {
                removed += trees.get(i) - cut;
            }
        }
        return removed;
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
