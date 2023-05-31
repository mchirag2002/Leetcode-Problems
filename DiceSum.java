import java.util.ArrayList;

public class DiceSum {
    public static void main(String[] args) {
        System.out.println(nums("",4));
    }
    static ArrayList<String> nums(String p, int up)
    {
        if(up==0)
        {
            ArrayList<String> ans = new ArrayList<String>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<String>();

        for(int i=1;i<=6;i++)
        {
            if(i>up)
            {
                break;
            }
            ans.addAll(nums(p+i,up-i));
        }
        return ans;
    }
}
