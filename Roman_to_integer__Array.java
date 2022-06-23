public class Roman_to_integer__Array {
    public static void main(String[] args) {
        String s = "XIV";
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c=='I')
            {
                if(i<s.length()-1)
                {
                    char d = s.charAt(i+1);
                    if(d=='V')
                    {
                        count+=4;
                        i++;
                    }
                    else if(d=='X')
                    {
                        count+=9;
                        i++;
                    }
                    else
                    {
                        count+=1;
                    }
                }
                else
                {
                    count+=1;
                }
            }
            else if(c=='V')
            {
                count+=5;
            }
            else if(c=='X')
            {
                if(i<s.length()-1)
                {
                    char d = s.charAt(i+1);
                    if(d=='L')
                    {
                        count+=40;
                        i++;
                    }
                    else if(d=='C')
                    {
                        count+=90;
                        i++;
                    }
                    else
                    {
                        count+=10;
                    }
                }
                else
                {
                    count+=10;
                }
            }
            else if(c=='L')
            {
                count+=50;
            }
            else if(c=='C')
            {
                if(i<s.length()-1)
                {
                    char d = s.charAt(i+1);
                    if(d=='D')
                    {
                        count+=400;
                        i++;
                    }
                    else if(d=='M')
                    {
                        count+=900;
                        i++;
                    }
                    else
                    {
                        count+=100;
                    }
                }
                else
                {
                    count+=100;
                }
            }
            else if(c=='D')
            {
                count+=500;
            }
            else
            {
                count+=1000;
            }
        }
        System.out.println(count);
    }
}
