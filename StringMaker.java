public class StringMaker {
    public static void main(String[] args) {
        System.out.println(isPossible("xy", "wz", "wxzy", "",-1));
    }
    static int isPossible(String a, String b, String c, String ans, int index)
    {
        if(index<c.length() && index>=0 && index<ans.length() && c.charAt(index)!=ans.charAt(index))
        {

            return 0;
        }
        if(c.equals(ans))
        {
            System.out.println(ans);
            return 1;

        }
        int count = 0;
        for(int i=0;i<a.length();i++)
        {

            count+= isPossible(a.substring(i),b,c,ans+a.charAt(i), index+1);
        }
        for(int i=0;i<b.length();i++)
        {

            count+= isPossible(a,b.substring(i),c,ans+b.charAt(i), index+1);
        }
        return count;
    }
}
