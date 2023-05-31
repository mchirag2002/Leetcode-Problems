public class StringReverse {
    public static void main(String[] args) {
        System.out.println(rev("leetcode",0));
    }

    public static String rev(String s, int i)
    {
        // ch + rev
        if(i==s.length())
        {
            return "";
        }
        char ch = s.charAt(i);
        return rev(s,i+1) + ch;
    }
}
