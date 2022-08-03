import java.util.Arrays;

public class Contest_9July22_q2 {
    public static void main(String[] args) {
        int[] buses = {3};
        int[] passengers = {4};
        int capacity = 2;
        int[][] matrix = new int[buses.length][capacity];
        int mytime = 0;
        bubbleSort(buses, buses.length);
        bubbleSort(passengers,passengers.length);
        int[] people = new int[buses.length];
        for (int i = 0; i < people.length; i++) {
            people[i]=0;
        }
        for (int i = 0; i < buses.length; i++) {
            for (int j = 0; j < passengers.length; j++) {
                if(passengers[j]<=buses[i] && people[i]<capacity && passengers[j]!=-1)
                {
                    matrix[i][people[i]] = passengers[j];
                    people[i]++;
                    passengers[j]=-1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        mytime = matrix[buses.length-1][capacity-1];

        if(mytime==0 && matrix[buses.length-1][capacity-2]<buses[buses.length-1])
        {
            mytime = matrix[buses.length-1][capacity-2];
            mytime++;
        }
        else if(mytime==0 && matrix[buses.length-1][capacity-2]==buses[buses.length-1])
        {
            mytime = matrix[buses.length-1][capacity-2];
            mytime--;
        }
        else
        {
            int x = capacity-2;
            mytime--;
            while(x>=0)
            {
                if(mytime==matrix[buses.length-1][x])
                {
                    mytime--;
                    x--;
                }
                else
                {
                    break;
                }
            }
        }

        System.out.println(mytime);
    }
    public static void bubbleSort(int [] sort_arr, int len){

        for (int i=0;i<len-1;++i){

            for(int j=0;j<len-i-1; ++j){

                if(sort_arr[j+1]<sort_arr[j]){

                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;

                }
            }
        }
    }
}
