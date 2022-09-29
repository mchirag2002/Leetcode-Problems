import java.util.ArrayList;
import java.util.List;

public class mergeSimilarItems {
    public static void main(String[] args) {
        int[][] items1 = {{1,1},{4,5},{3,8}};
        int[][] items2 = {{3,1},{1,5}};
        System.out.println(mergeSimilarItems(items1, items2));
    }
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int flag = 0, present = 0;
        if((items1.length> items2.length))
        {
           flag=1;
        }
        for (int i = 0; i < (items1.length> items2.length?items1.length: items2.length); i++) {
            for (int j = 0; j < (items1.length< items2.length?items1.length: items2.length); j++) {
                List<Integer> inner = new ArrayList<Integer>();
                if(flag==1)
                {
                    //items1 > items2
                    if(j < items2.length)
                    {
                        if(items1[i][0]==items2[j][0])
                        {
                            inner.add(items1[i][0]);
                            int sum = items1[i][1] + items2[j][1];
                            inner.add(sum);
                            ret.add(inner);
                            present = 1;
                        }
                    }
                }
                else
                {
                    //items2> items1
                    if(i < items1.length)
                    {
                        if(items1[i][0]==items2[j][0])
                        {
                            inner.add(items1[i][0]);
                            int sum = items1[i][1] + items2[j][1];
                            inner.add(sum);
                            ret.add(inner);
                            present = 1;
                        }
                    }
                }


            }
        }



        return ret;
    }
}
