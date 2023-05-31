import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PopularVideoCreator {
    public static void main(String[] args) {
        String[] c = {"alice","bob","alice","chris"};
        String[] id = {"one","two","three","four"};
        int[] views = {5,10,5,4};

    }
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        List<List<String>> ans = new ArrayList<>();
        List<String> id = new ArrayList<>();
        int n = views.length;
        int[] occur = new int[views.length];
        for(int i=0;i<occur.length;i++)
        {
            occur[i] = 0;
        }
        String[] name = new String[n];
        name[0] = creators[0];
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(creators[i].equals(creators[j]))
                {
                    occur[i]++;
                }
            }
        }
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(occur));
        return ans;
    }
}
