public class mirrorReflectionProblem {
    public static void main(String[] args) {
//        https://leetcode.com/problems/mirror-reflection/
        System.out.println(mirrorReflection(3,1));
    }
    static int mirrorReflection(int p, int q) {
        int reflector = 0;
        int count = 0, i=q;
        for (; i <p; i+=q) {
            count++;
        }
        if (i==p)
        {
            if(count%2==0)
            {
                reflector=1;
            }
            else
            {
                reflector=2;
            }
        }
        return reflector;
    }
}
