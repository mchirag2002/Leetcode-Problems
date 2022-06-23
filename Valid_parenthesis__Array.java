public class Valid_parenthesis__Array {
    public static void main(String[] args) {
        String s = "(([]){})";
        String str = "";
        String ptr = "";
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                //str.concat("(");
                str = str+"(";
            }
            else if(s.charAt(i)=='{')
            {
                //str.concat("{");
                str+="{";
            }
            else if(s.charAt(i)=='[')
            {
                //str.concat("[");
                str+="[";
            }
            else if(s.charAt(i)==')')
            {
                if(str.endsWith("("))
                {
                    if(str.length()>1)
                    {ptr = "";
                        for(int j = 0; j<str.length()-1; j++)
                        {
                            //ptr.concat(String.valueOf(str.charAt(j)));
                            ptr+=str.charAt(j);
                        }
                        str = ptr;
                    }
                    else
                    {
                        str = "";
                    }
                }
                else
                {
                    System.out.println("false");
                }
            }
            else if(s.charAt(i)=='}')
            {
                if(str.endsWith("{"))
                {
                    if(str.length()>1)
                    {ptr = "";
                        for(int j = 0; j<str.length()-1; j++)
                        {
                            //ptr.concat(String.valueOf(str.charAt(j)));
                            ptr+=str.charAt(j);
                        }
                        str = ptr;}
                    else
                    {
                        str = "";
                    }
                }
                else
                {
                    System.out.println("false");
                }
            }
            else if(s.charAt(i)==']')
            {
                if(str.endsWith("["))
                {
                    if(str.length()>1)
                    {ptr = "";
                        for(int j = 0; j<str.length()-1; j++)
                        {
                            //ptr.concat(String.valueOf(str.charAt(j)));
                            ptr+=str.charAt(j);
                        }
                        str = ptr;}
                    else
                    {
                        str = "";
                    }
                }
                else
                {
                    System.out.println("false");
                }
            }
        }
        if(str.length()==0)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
