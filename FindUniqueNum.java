public class FindUniqueNum {
    public static void main(String[] args) {
        //find the only unique number in the array
        int[] arr = {2, 1, 5, 9, 2, 1, 5, 9, 3};
        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        //logic: a^a==0 and a^0==a
        //hence saare repeated numbers aapas me xor hoke zero ho jaayenge and unique element bachega
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans^arr[i];
        }
        return ans;
    }
}
