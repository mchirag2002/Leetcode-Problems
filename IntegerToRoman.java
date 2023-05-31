public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 73;
        String a = intToRoman(num);
        System.out.println(a);
    }

    static String reverse(String a)
    {
        char[] try1 = a.toCharArray();
        String b = "";
        for (int i = try1.length - 1; i >= 0; i--)
            b = b + try1[i];
        return b;
    }

    static String intToRoman(int num)
    {
        String a = "";
        int temp = num;
        for (int i=0; temp > 0 ; temp/=10,i++) {
            int n = temp%10;
            int place = (int) Math.pow(10,i);
            n = n*place;
            if(n==1)
            {
                a = a + "I";
            }
            else if(n>1 && n<4)
            {
                while(n>=1)
                {
                    a = a + "I";
                    n--;
                }
            }
            else if(n==4)
            {
                a = a + "VI";
            }
            else if(n==5)
            {
                a = a + "V";
            }
            else if(n>5 && n<9)
            {
                while(n>5)
                {
                    a = a + "I";
                    n--;
                }
                a = a + "V";
            }
            else if(n==9)
            {
                a = a + "XI";
            }
            else if(n==10)
            {
                a = a + "X";
            }
            else if(n>10 && n<40)
            {
                a = a + "X";
                while(n>10)
                {
                    n-=10;
                    a = a + "X";
                }
            }
            else if(n==40)
            {
                a = a + "LX";
            }
            else if(n==50)
            {
                a = a + "L";
            }
            else if(n>50 && n<90)
            {
                while(n>50)
                {
                    a = a + "X";
                    n-=10;
                }
                a = a + "L";
            }
            else if(n==90)
            {
                a = a + "CX";
            }
            else if(n==100)
            {
                a = a + "C";
            }
            else if(n>100 && n<400)
            {
                a = a + "C";
                while(n>100)
                {
                    n-=100;
                    a = a + "C";
                }
            }
            else if(n==400)
            {
                a = a + "DC";
            }
            else if(n==500)
            {
                a = a + "D";
            }
            else if(n>500 && n<900)
            {
                while(n>500)
                {
                    a = a + "C";
                    n-=100;
                }
                a = a + "D";
            }
            else if(n==900)
            {
                a = a + "MC";
            }
            else if(n==1000)
            {
                a = a + "M";
            }
            else if(n>1000 && n<4000)
            {
                a = a + "M";
                while(n>1000)
                {
                    n-=1000;
                    a = a + "M";
                }
            }

            //System.out.println(place);
        }
        a = reverse(a);
        return a;
    }

}
