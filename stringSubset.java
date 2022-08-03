import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class stringSubset {
    public static void main(String[] args) {
        String[] words1 = {"facebook","google","leetcode"};
        String[] words2 = {"e","oo"};
        System.out.println(wordSubsets(words1, words2));
    }
    static public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> word = new ArrayList<String>();
        for (int i = 0; i < words1.length; i++) {
            int count = 0;
            String[] w = new String[words1[i].length()];
            for (int j = 0; j < words1[i].length(); j++) {
                String a;
                a = Character.toString(words1[i].charAt(j));
                w[j] = a;
            }
            int flag =0;
            for (int j = 0; j < words2.length; j++) {
                if(words2[j].length()==1)
                {
                    for (int k = 0; k < w.length; k++) {
                        if(words2[j].equals(w[k]))
                        {
                            w[k] = "0";
                            count++;
                            break;
                        }
                    }
                }
                else
                {
                    int c = 0;
                    for (int k = 0; k < w.length; k++) {

                        String ab[] = new String[words2[j].length()];

                        for (int l = 0; l < words2[j].length(); l++) {
                            String a;
                            a = Character.toString(words2[j].charAt(l));
                            ab[l] = a;
                        }
//                        System.out.println(Arrays.toString(ab));
                        for (int l = 0; l < ab.length; l++) {
                            if(words2[j].equals(ab[l]))
                            {
//                             = "0";
                                c++;
                                break;
                            }
                        }
                        if(c==ab.length)
                        {
                            flag=1;
                        }

                    }
                }
            }
            if(count==words2.length || flag ==1)
            {
                word.add(words1[i]);
            }
        }
        return word;
    }
}
