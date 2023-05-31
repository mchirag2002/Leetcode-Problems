package CRT;

import java.util.ArrayList;
import java.util.HashMap;

public class MinCharAccessForString {
    public static void main(String[] args) {
        String str =  "064819848398";
        int m = 3;
        String[] q = {"088", "364", "07"};
        //bruteForce(str, q);
        optimized(str,q);
    }
    public static void bruteForce(String str, String[] q)
    {
        for(int i=0;i<q.length;i++)
        {
            int count[] = new int[10];
            for(int j=0;j<q[i].length();j++)
            {
                count[q[i].charAt(j)-'0']++;
            }
            int ans = -1;
            for(int j=0;j<str.length();j++)
            {
                if(count[str.charAt(j)-'0']>0)
                    count[str.charAt(j)-'0']--;
                boolean zeroes = true;
                for (int k = 0; k < count.length; k++) {
                    if(count[k]!=0)
                    {
                        zeroes = false;
                    }
                }
                if(zeroes)
                {
                    ans = j+1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }

    public static void test(String str, String[] q)
    {
//        for (int i = 0; i < q.length; i++) {
//            ArrayList<Character> arr = new ArrayList<Character>();
//            for(int j=0;)
//        }
    }

    public static void optimized(String str, String[] q)
    {
        HashMap<Character,ArrayList<Integer>> m = new HashMap<Character, ArrayList<Integer>>();
        for(int i=0;i<str.length();i++)
        {
//            m.put(str.charAt(i),m.get(str.charAt(i)).add(i));
        }
        for(int x=0;x<q.length;x++)
        {
            int[] requirement = new int[10];
            for(int i=0;i<q[x].length();i++)
            {
                requirement[q[x].charAt(i)-'0']++;
            }
            int ans = Integer.MIN_VALUE;
            for(int i=0;i<10;i++)
            {
                if(requirement[i]==0)
                    continue;
                if(m.get(i+'0').size()<requirement[i])
                {
                    ans = -2;
                    break;
                }
                ans = Math.max(ans,m.get(i-'0').get(requirement[i]-1));
            }
            System.out.println(ans);
        }
    }


}
