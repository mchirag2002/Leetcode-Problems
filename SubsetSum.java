import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(5);
        temp.add(8);
        temp.add(11);
        temp.add(13);

        System.out.println(subsetSums(temp,5));
    }
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> temp = subsetInt(arr,ans);
        Collections.sort(ans);
        return ans;
    }

    static ArrayList<ArrayList<Integer>> subsetInt(ArrayList<Integer> up, ArrayList<Integer> sum)
    {
        ArrayList<ArrayList<Integer>> ans_main = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans_main.add(ans);
        sum.add(0);
        for (int i = 0; i < up.size(); i++) {
            int x = ans_main.size();
            for (int j = 0; j < x; j++) {
                int s = 0;
                ArrayList<Integer> temp = new ArrayList<>(ans_main.get(j));
                temp.add(up.get(i));
                for (int k = 0; k < temp.size(); k++) {
                    s += temp.get(k);
                }
                sum.add(s);
                ans_main.add(temp);
//                System.out.println(temp);
            }
        }
        return ans_main;
    }

}
