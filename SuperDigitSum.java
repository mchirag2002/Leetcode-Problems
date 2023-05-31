public class SuperDigitSum {
    public static void main(String[] args) {

        System.out.println(superDigit("148",3));
    }
    public static int superDigit(String nem, int k) {
        // Write your code here
        if(nem.length()==1)
        {
            return nem.charAt(0)-'0';
        }
        String n = nem+"";
        for(int i=0;i<k-1;i++)
        {
            n+=nem;
        }
        int sum = 0;
        for(int i=0;i<n.length();i++)
        {
            sum+=n.charAt(i)-'0';
        }
        n = sum+"";
        return superDigit(n,0);
    }
}
