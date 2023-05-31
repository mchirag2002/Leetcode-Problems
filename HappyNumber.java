public class HappyNumber {

//link = https://leetcode.com/problems/happy-number/description/
/*
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
 */
    //logic = every single digit number except 1 and 7 is a happy number
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
    static boolean isHappy(int n)
    {
        boolean ans = check(n);
        return ans;
    }
    static boolean check(int n)
    {
        if(n==1 || n==7)
        {
            return true;
        }
        if(n/10==0)
        {
            return false;
        }
        int sum = 0;
        for(int i = n;i>0;i/=10)
        {
            sum+= (i%10)*(i%10);
        }
        if(sum==1)
        {
            return true;
        }
        return check(sum);
    }
}
