public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int count=0;
        System.out.println(digits2(1234));
        for (int i = 0; i < nums.length; i++) {
            int len = digits2(nums[i]);
            if(len%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }

    static int digits2(int num)
    {
        return (int)(Math.log10(num)) + 1;
    }

    static int digits(int num)
    {
        int d=0, x=num;
        for(int i=10; x>0; x/=10)
        {
            d++;
        }
        return d;
    }
}
