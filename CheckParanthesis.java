public class CheckParanthesis {

    //link - https://leetcode.com/problems/valid-parentheses/description/

    public static void main(String[] args) {
        String s = "(){]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        char[] check = new char[s.length()+1];
        int n=0;
        check[0]='.';
        for(int i=0;i<s.length();i++)
        {
            char a = s.charAt(i);
            if(a=='(' || a=='{' || a=='[')
            {
                n++;
                check[n] = a;
            }
            else
            {
                // if(n==0)
                // {
                //     return true;
                // }
                if(a==')' && check[n]=='(')
                {
                    n--;
                }
                else if(a=='}' && check[n]=='{')
                {
                    n--;
                }
                else if(a==']' && check[n]=='[')
                {
                    n--;
                }
                else
                {
                    return false;
                }
            }
        }
        if(n==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
