public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        char[] letters = {'c','f','j'};
        char target = 'g';
        System.out.println(nextGreatestLetter(letters, target));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if(target>letters[letters.length-1])
        {
            return letters[0];
        }
        if(target==letters[letters.length-1])
        {
            return letters[0];
        }
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(letters[mid]==target)
            {

                if(letters[mid+1]==letters[mid])
                {
                    while(letters[mid+1]==letters[mid])
                    {
                        mid++;
                    }
                }
                else if(mid==letters.length-1)
                {
                    mid = -1;
                }
                return letters[mid+1];
            }
            else if(letters[mid]>target)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return letters[start];
    }
    static char kunalSolution(char[] letters, char target)
    {
        int start = 0;
        int end = letters.length-1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(target < letters[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
