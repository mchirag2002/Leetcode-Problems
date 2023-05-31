public class LongestCommonPrefix {
    public static void main(String[] args) {
        String a[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(a));
    }
    public static String longestCommonPrefix(String[] strs) {
        int end = -1;
        for(int i=0;i>=0;i++)
        {
            if(isSame(strs, i))
            {
                end++;
            }
            else
            {
                break;
            }
        }
        String ans = "";
        for(int i=0;i<=end;i++)
        {
            ans+=strs[0].charAt(i);
        }
        return ans;
    }
    public static boolean isSame(String[] strs, int index)
    {
        char c = '0';
        if(index<strs[0].length())
        {
            c = strs[0].charAt(index);
        }
        else
        {
            return false;
        }
        for(int i=0;i<strs.length;i++)
        {
            if(index>=strs[i].length())
            {
                return false;
            }
            if(strs[i].charAt(index)!=c)
            {
                return false;
            }
        }
        return true;
    }
}
