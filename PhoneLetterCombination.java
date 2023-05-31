import java.util.ArrayList;

public class PhoneLetterCombination {
    public static void main(String[] args) {
        System.out.println(combination("","9"));
    }
    static ArrayList<String> combination(String p, String up)
    {
        if(up.length()==0)
        {
            ArrayList<String> ans = new ArrayList<String>();
            ans.add(p);
            return ans;
        }
        char ch = up.charAt(0);
        String letter = "";
        if(ch=='2')
        {
            letter = "abc";
        }
        else if(ch=='3')
        {
            letter = "def";
        }
        else if(ch=='4')
        {
            letter = "ghi";
        }
        else if(ch=='5')
        {
            letter = "jkl";
        }
        else if(ch=='6')
        {
            letter = "mno";
        }
        else if(ch=='7')
        {
            letter = "pqrs";
        }
        else if(ch=='8')
        {
            letter = "tuv";
        }
        else if(ch=='9')
        {
            letter = "wxyz";
        }
        //System.out.println(letter);
        ArrayList<String> ans = new ArrayList<String>();
        for(int i=0;i<letter.length();i++)
        {
            char c = letter.charAt(i);
            ans.addAll(combination(p+c, up.substring(1)));
        }
        return ans;
    }
}
