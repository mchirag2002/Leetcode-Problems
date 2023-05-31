public class StringWithoutA {
    //to return the string without alphabet a in it
    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(reduce(str,0,""));
        skip(str,"");
        System.out.println(skip(str));
        System.out.println(skipApple("bcapplecd"));
        System.out.println(skipAppNotApple("bcappbbapplecd"));
    }
    static String reduce(String str, int index, String ans)
    {
        if(str.length()==index)
        {
            return ans;
        }
        if(str.charAt(index)=='a')
        {
            return reduce(str, index+1, ans);
        }
        else
        {
            ans+=str.charAt(index);
            return reduce(str, index+1, ans);
        }
    }
    static void skip(String str, String ans)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        char c = str.charAt(0);
        if(c=='a')
        {
            skip(str.substring(1), ans);
        }
        else
        {
            skip(str.substring(1), ans+c);
        }
    }
    static String skip(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        char c = str.charAt(0);
        if(c=='a')
        {
            return skip(str.substring(1));
        }
        else
        {
            return c + skip(str.substring(1));
        }
    }
    static String skipApple(String str)
    {
        if(str.length()==0)
        {
            return "";
        }
        if(str.startsWith("apple"))
        {
            return skipApple(str.substring(5));
        }
        else
        {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }
    static String skipAppNotApple(String str)
    {
        if(str.length()==0)
        {
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple"))
        {
            return skipAppNotApple(str.substring(3));
        }
        else
        {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}
