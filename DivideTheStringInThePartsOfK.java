import java.util.Arrays;

public class DivideTheStringInThePartsOfK {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divideString("abcdefghij",3,'x')));
    }
    public static String[] divideString(String s, int k, char fill) {
        int size;
        if(s.length()%k==0)
        {
            size = s.length()/k;
        }
        else
        {
            size = (s.length()/k) + 1;
        }
        String[] str = new String[(size)];
        for (int i = 0; i <size; i++) {
            String p = "";
            for (int j = i*k; j < (i+1)*k; j++) {
                if(j>=s.length())
                {
                    p+=fill;
                }
                else
                {
                    p += s.charAt(j);
                }
            }
            str[i] = p;
        }
        return str;
    }
}
