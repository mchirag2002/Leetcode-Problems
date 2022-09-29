import java.util.Arrays;

public class UniqueMorseCodeWords {
//    https://leetcode.com/problems/unique-morse-code-words/
    public static void main(String[] args) {
        String[] words = {"zocd","gjkl","hzqk","hzgq","gjkl"};
        System.out.println(uniqueMorseRepresentations(words));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int count = 0;
//        if(words.length>0)
//        {
//            count=1;
//        }
        String[] morse = new String[words.length];
        int[] number = new int[words.length];
        for (int i = 0; i < morse.length; i++) {
            morse[i] = "";
        }
        for (int i = 0; i < number.length; i++) {
            number[i] = 0;
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                morse[i] = morse[i] + morseCode[ch-'a'];
            }
        }
        for (int i = 0; i < morse.length; i++) {
            for (int j = i+1; j < morse.length; j++) {
                if(number[i]==1)
                {
                    continue;
                }
                if(morse[i].equals(morse[j]))
                {
                    number[j]=1;
                }
            }
        }
        for (int i = 0; i < number.length; i++) {
            if(number[i]==0)
            {
                count++;
            }
        }
        return count;
    }
}
