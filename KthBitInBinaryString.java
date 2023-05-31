import java.util.*;

public class KthBitInBinaryString {
    //https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
    public static void main(String[] args) {
        System.out.println(findKthBit(4,11));
    }
    public static char findKthBit(int n, int k)
    {
//        String ans = find(n);
//        System.out.println(ans);
        ArrayList<String> s = new ArrayList<String>();
        findRec(n,s,new ArrayList<String>());
        String ans = s.get(s.size()-1);
        return ans.charAt(k-1);
    }
    public static String find(int n)
    {
       String s = "0";
       String rev = "1";
       for(int i=1;i<=n;i++)
       {
           String temp = s+"";
           s = s+"1"+rev;
           rev = temp + "0" + rev;
       }
       return s;
    }
    public static void findRec(int n, ArrayList<String> s, ArrayList<String> rev)
    {
        if(n==1)
        {
            s.add("0");
            rev.add("1");
            return;
        }
        findRec(n-1,s,rev);
        String str = s.get(s.size()-1) + "1" + rev.get(rev.size()-1);
        String r = s.get(s.size()-1) + "0" + rev.get(rev.size()-1);
        s.add(str);
        rev.add(r);
    }
}
