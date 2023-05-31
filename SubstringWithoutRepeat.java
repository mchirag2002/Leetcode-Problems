import java.util.ArrayList;

public class SubstringWithoutRepeat {
    public static void main(String[] args) {
        System.out.println(check("aabaab!bb"));
    }
    static int check(String s)
    {
        int len = 0;
        int max_len = 0;
        ArrayList<Character> arr = new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(arr.contains(s.charAt(i)))
            {
                int j=0;
                while(true)
                {
                    if(s.charAt(j)!=s.charAt(i))
                    {
                        char c = s.charAt(j++);
                        arr.remove(Character.valueOf(c));
                        len--;
                    }
                    else
                    {
                        char c = s.charAt(j);
                        arr.remove(Character.valueOf(c));
                        break;
                    }
                }
                arr.add(s.charAt(i));
            }
            else
            {
                arr.add(s.charAt(i));
                len++;
                if(len>max_len)
                {
                    max_len = len;
                }
            }
        }
        return max_len;
    }

}
