import java.util.ArrayList;

public class SubSeq {
    //p = processed
    //up = unprocessed
    public static void main(String[] args) {
//        subseqAscii("","abc");
        System.out.println(subAscii("","abc"));

    }
    static void subs(String p, String up)
    {
        if(up.length()==0)
        {
            System.out.println(p);
            return;
        }
        subs(p + up.charAt(0), up.substring(1));
        subs(p , up.substring(1));
    }
    static ArrayList<String> sub(String p, String up)
    {
        if(up.length()==0)
        {
            ArrayList<String> x = new ArrayList<String>();
            x.add(p);
            return x;
        }
        ArrayList<String> left = sub(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = sub(p , up.substring(1));
        left.addAll(right);
        return left;
    }
    static void subseqAscii(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p+ch, up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }
    static ArrayList<String> subAscii(String p, String up)
    {
        if(up.length()==0)
        {
            ArrayList<String> x = new ArrayList<String>();
            x.add(p);
            return x;
        }
        ArrayList<String> first = subAscii(p + up.charAt(0), up.substring(1));
        ArrayList<String> second = subAscii(p , up.substring(1));
        ArrayList<String> third = subAscii(p + (up.charAt(0)+0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
