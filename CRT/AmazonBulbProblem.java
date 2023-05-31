package CRT;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AmazonBulbProblem {
    //bulb ki position and strength di hui hai, bulb pos+-strength tak illuminate krta h
    //agar n number of total possible positions hai to btao last me kitni jagah
    //non illuminated rahegi
    public static void main(String[] args) {
        int[] bulb = {2,5,7};
        int[] power = {1,1,2};
        int n = 12;
        System.out.println(luminate(bulb, power, n));
    }

    public static int luminate(int[] bulb, int[] power, int n) {
        int[] arr = new int[n];
        for(int i=0;i<bulb.length;i++)
        {
            int start = Math.max(bulb[i]-1 - power[i],1);
            int end = Math.min(bulb[i]-1 + power[i],n-1);
            arr[start]++;
            arr[end+1]--;
            //hamesha end ke baad waale ko negative karte h
            //yeh min max isliye kiya ki kahi range 0->n-1 se bahar na chali jaaye
        }
        int count =0;
        for(int i=1;i<arr.length;i++)
        {
            arr[i] = arr[i] + arr[i-1];
            if(arr[i]==0)
            {
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return count;
    }


}
