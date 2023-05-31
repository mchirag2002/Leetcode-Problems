import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add("leet");
        a.add("code");
        System.out.println(wordBreak("leetcode", a));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        for(int i=0;i<wordDict.size();)
        {
            String str = wordDict.get(i);
            int index = s.indexOf(str);
            if(index==-1 || index >=s.length())
            {
                i++;
                continue;
            }
            String f = s.substring(0,index);
            String a = s.substring(index+str.length(),s.length());
            s = f+a;
        }
        if(s.length()==0)
        {
            return true;
        }
        return false;
    }
}
