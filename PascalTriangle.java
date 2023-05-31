import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(25));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> r1 = new ArrayList<Integer>();
        r1.add(1);
        ans.add(r1);
        if(numRows==1)
        {
            return ans;
        }
        List<Integer> r2 = new ArrayList<Integer>();
        r2.add(1);
        r2.add(1);
        ans.add(r2);
        for(int i=2;i<numRows;i++)
        {
            List<Integer> r3 = new ArrayList<Integer>();
            r3.add(1);
            List<Integer> prev = ans.get(i-1);
            int num1 = 0;
            int num2 = 1;
            while(num2< prev.size())
            {
                int n = prev.get(num1++) + prev.get(num2++);
                r3.add(n);
            }
            r3.add(1);
            ans.add(r3);
        }

        return ans;
    }

}
