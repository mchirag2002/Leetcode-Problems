import java.util.ArrayList;

public class SubseqIterative {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        ArrayList<ArrayList<Integer>> ans_main = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans_main.add(ans);
        for (int i = 0; i < 3; i++) {
            int x = ans_main.size();
            for(int j=0;j<x;j++)
            {
                ArrayList<Integer> temp = new ArrayList<>(ans_main.get(j));
                temp.add(arr[i]);
                ans_main.add(temp);
//                System.out.println(temp);
            }
        }
        System.out.println(ans_main);
    }
}
