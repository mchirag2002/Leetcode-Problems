public class NoOfDigits_Base_change {
    public static void main(String[] args) {
        int n  = 16;
        int base = 2;
        int digits = (int) (Math.log(n) / Math.log(base)) +1;

        System.out.println(digits);
    }
}
