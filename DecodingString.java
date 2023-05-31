public class DecodingString {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        System.out.println(solve(s, 0, 0));
    }
    public static String solve(String s, int start, int repeat)
    {
        String ans = "";
        if(start>=s.length()-2)
        {
            return "";
        }
        if(Character.isDigit(s.charAt(start)) && !Character.isDigit(s.charAt(start+1)))
        {
            return solve(s, start+2, (int)s.charAt(start)-48);
        }
        else
        {
            int end = start+1;
            while(true)
            {
                if(Character.isLetter(s.charAt(end))&&end<s.length())
                {
                    end++;
                }
                else if(Character.isDigit(s.charAt(end)) && end<s.length())
                {
                    ans =  solve(s, end+2, (int)s.charAt(end)-48);
                    break;
                }
                else
                {
                    break;
                }
            }
            for(int i=0;i<repeat;i++)
            {
                for(int j=start;j<end;j++)
                {
                    ans+=s.charAt(j);
                }
            }
            return ans + solve(s, end+1, 0);
        }
    }
}
