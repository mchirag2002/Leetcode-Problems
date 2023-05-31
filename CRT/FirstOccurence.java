package CRT;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstOccurence {
    //ek given index number ke baad us number ki first occurence btani hai
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 2, 0, 0, 1, 2, 2, 2};
//          int[][] q = {
//                {2,0},
//                {2,2},
//                {2,4},
//                {2,5},
//                {3,1}
//        };
        HashMap<Integer, ArrayList<Integer>> m = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.get(arr[i]).add(i);
            } else {
                ArrayList<Integer> c = new ArrayList<>();
                c.add(i);
                m.put(arr[i], c);
            }
        }
//        System.out.println("last occurence - ");
//        last(m,q);
//        System.out.println("first occurence - ");
//        first(m,q);
        System.out.println(countInRange(m,11,10,2));
    }

    public static int last(HashMap<Integer,ArrayList<Integer>> m, int x, int y)
    {

            //System.out.println(y);
            ArrayList<Integer> temp = new ArrayList<>(m.get(x));
            int s = 0;
            int e = (int) temp.size() - 1;
            int ans = -1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (temp.get(mid) <= y) {
                    ans = temp.get(mid);
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
            return ans;



    }

    public static int first(HashMap<Integer,ArrayList<Integer>> m, int x, int y) {

            //System.out.println(y);
            ArrayList<Integer> temp = new ArrayList<>(m.get(x));
            int s = 0;
            int e = (int) temp.size() - 1;
            int ans = -1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (temp.get(mid) <= y) {
                    s = mid + 1;
                } else {
                    ans = temp.get(mid);
                    e = mid - 1;
                }
            }
            return ans;
    }

    public static int countInRange(HashMap<Integer,ArrayList<Integer>> m, int left, int right, int x)
    {
        // we have to return the number of occurences present in the given range inclusive
        int l = firstHelp(m,x,left);
        int r = lastHelp(m,x,right);
        if(l==-1 || r==-1)
        {
            return 0;
        }
        return r-l+1;
    }

    public static int lastHelp(HashMap<Integer,ArrayList<Integer>> m, int x, int y)
    {

        //System.out.println(y);
        ArrayList<Integer> temp = new ArrayList<>(m.get(x));
        int s = 0;
        int e = (int) temp.size() - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (temp.get(mid) <= y) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;



    }

    public static int firstHelp(HashMap<Integer,ArrayList<Integer>> m, int x, int y) {

        //System.out.println(y);
        ArrayList<Integer> temp = new ArrayList<>(m.get(x));
        int s = 0;
        int e = (int) temp.size() - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (temp.get(mid) <= y) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }
}
