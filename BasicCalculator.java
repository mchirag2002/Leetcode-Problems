public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println(calculate(" 2-1 + 2 "));
//          System.out.println(calculate(" 1-1 "));

    }
    public static int calculate(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            if(i>=s.length())
            {
                break;
            }
            if (Character.isDigit(s.charAt(i))) {

                int num1 = s.charAt(i++) - '0';

                while (i < s.length() && s.charAt(i) == ' ' ) {
                    i++;
                }
                if(i>=s.length())
                {
                    break;
                }
                char operator = s.charAt(i++);
                while (s.charAt(i) == ' ' && i < s.length()) {
                    i++;
                }
                if (operator == '+') {
                    res +=  (num1 + (s.charAt(i) - '0'));
                } else if (operator == '-') {
                    res += (num1 - (s.charAt(i) - '0'));
                }
            }
            else
            {
                char operator = s.charAt(i++);
                while (s.charAt(i) == ' ' && i < s.length()) {
                    i++;
                }
                if(i>=s.length())
                {
                    break;
                }
                int num1 = s.charAt(i++) - '0';
                if (operator == '+') {
                    res +=  (num1 );
                } else if (operator == '-') {
                    res += (num1 );
                }
            }

        }
        return res;
    }
}
