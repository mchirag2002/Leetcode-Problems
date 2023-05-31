public class MaxPopulation {
    public static void main(String[] args) {
        int[][] arr = {{1950,1961},{1960,1971},{1970,1981}};
        //prints year in which max population exists
        System.out.println(maximumPopulation(arr));
    }
    public static int maximumPopulation(int[][] logs) {
        int arr[] = new int[2051];
        for(int i=0;i<logs.length;i++)
        {
            arr[logs[i][0]]++;
            arr[logs[i][1]]--;
        }
        int sum = arr[1949];
        for(int i=1950;i<arr.length;i++)
        {
            sum = sum+arr[i];
            arr[i] = sum;
        }
        int maxalive = 1;
        for(int i=1950;i<arr.length;i++)
        {
            if(arr[i]>maxalive)
            {
                maxalive=arr[i];
            }
        }
        int max = 0;
        for(int i=1950;i<arr.length;i++)
        {
            if(arr[i]==maxalive)
            {
                max=i;
                break;
            }
        }
        return max;
    }
}
