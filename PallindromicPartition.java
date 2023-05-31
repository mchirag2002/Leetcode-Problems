import java.util.*;
public class PallindromicPartition {
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<List<String>>();
        List<String> temp = new ArrayList<String>();
        partitionHelper(s, 0, ans, temp);
        return ans;
    }
    public static void partitionHelper(String s, int index, List<List<String>> ans, List<String> a)
    {
        if(index==s.length())
        {
            ans.add(new ArrayList<String>(a));
            return;
        }
        for(int i=index;i<s.length();i++)
        {
            if(isPalindrome(s, index, i))
            {
                a.add(s.substring(index,i+1));
                partitionHelper(s, i+1, ans, a);
                a.remove(a.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s, int start, int end)
    {
        while(start<=end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }
}
