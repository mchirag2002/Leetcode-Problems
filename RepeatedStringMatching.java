public class RepeatedStringMatching {
    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("abc","cabcabca"));
    }
    public static int repeatedStringMatch(String a, String b) {
        int repeat = 1;
        String test = a+"";
        while((a.length())<b.length())
        {
            repeat++;
            a += test;
        }
        int count=0;
        while(!isSubstring(a,b))
        {
            if(count>3)
            {
                return -1;
            }
            repeat++;
            count++;
            a+=a;
        }
        if(!isSubstring(a,b))
        {
            return -1;
        }
        return repeat;
    }
    public static boolean isSubstring(String a, String b)
    {
        boolean found = false;
        for(int i=0;i<=(a.length()-b.length());i++)
        {
            for(int j=i,k=0;k<b.length();k++,j++)
            {
                if(a.charAt(j)==b.charAt(k))
                {
                    found = true;
                }
                else
                {
                    found = false;
                    break;
                }
            }
            if(found)
            {
                return true;
            }
        }
        return found;
    }
}
