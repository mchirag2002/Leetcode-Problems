public class MagicNum_AMAZON {
    public static void main(String[] args) {
        //magic num is binary ki digits ko 5 ki power me likho
        //100 is 125, 101 is 130
        int n = 3;//3rd magic num - 011 = 25 + 5 = 30
        int ans = 0;
        int base = 5;
        while(n>0)
        {
            int last = n&1;//last digit
            n = n>>1;
            ans += last*base;
            base = base * 5;
        }
        System.out.println(ans);

    }
}
