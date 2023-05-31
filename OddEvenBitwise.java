public class OddEvenBitwise {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(isOdd(12));
    }

    private static boolean isOdd(int n) {
        return (n&1)==1;
    }
}
