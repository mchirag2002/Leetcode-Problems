import java.util.ArrayList;
import java.util.Arrays;

public class PowerSetLexicographical {
    static ArrayList<String> permuteRec(String str, int n, int index, String curr, ArrayList<String> ans)
    {
        // base case
        if (index == n) {
            return ans;
        }
        ans.add(curr);
        for (int i = index + 1; i < n; i++) {

            curr += str.charAt(i);
            permuteRec(str, n, i, curr, ans);

            // backtracking
            curr = curr.substring(0, curr.length() - 1);
        }
        return ans;
    }

    // Generates power set in lexicographic
    // order.
    static ArrayList<String> powerSet(String str)
    {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        ArrayList<String> ans = permuteRec(new String(arr), str.length(), -1, "", new ArrayList<String>());
        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "cab";
        System.out.println(powerSet(str));
    }
}
