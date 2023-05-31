import java.util.ArrayList;

public class MergeIntervals {
    public static void main(String[] args) {
        int arr[][] = {{2,3},{4,5},{6,7},{1,10}};
        int ans[][] = merge(arr);
    }
    public static int[][] merge(int[][] intervals) {
        ArrayList<Integer> starts = new ArrayList<Integer>();
        ArrayList<Integer> ends = new ArrayList<Integer>();
        //starts.add(intervals[0][0]);
        int i=0;
//        int min = Integer.MAX_VALUE;
//        int max = -1;
        int start = intervals[i][0];

        int end = intervals[i][1];
//        if(start<min)
//        {
//            min = start;
//        }
//        if(end>max)
//        {
//            max = end;
//        }
        for(int j=i+1;j<intervals.length;j++)
        {
            int s = intervals[j][0];
//            if(s<min)
//            {
//                min = s;
//            }
            int e = intervals[j][1];
//            if(e>max)
//            {
//                max = e;
//            }
            if(s==e)
            {
                starts.add(s);
                ends.add(e);
                continue;
            }
            if(s<start)
            {
                start = s;
            }
            if(s<=end)
            {
                if(intervals[j][1]>=end)
                {
                    end = intervals[j][1];
                }
            }
            else
            {
                starts.add(start);
                ends.add(end);
                start = s;
                end = intervals[j][1];
            }
        }
        starts.add(start);
        ends.add(end);
        for(int j=starts.size()-1;j>0;j--)
        {
            if(starts.get(j)<starts.get(j-1))
            {
                if(starts.get(j-1)<ends.get(j))
                {
                    starts.remove(j-1);
                }
                if(ends.get(j-1)<ends.get(j))
                {
                    ends.remove(j-1);
                }
                else
                {
                    ends.remove(j);
                }
            }
        }
        System.out.println(starts);
        System.out.println(ends);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int j=0;j<starts.size();j++)
        {
            temp.add(starts.get(j));
            temp.add(ends.get(j));
        }
        //System.out.println(min);
        //System.out.println(max);
        int ans[][] = new int[temp.size()/2][2];
        for(int j=0, x=0;j<ans.length;j++)
        {
            ans[j][0] = temp.get(x++);
            ans[j][1] = temp.get(x++);
        }
        return ans;
    }
}
