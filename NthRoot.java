public class NthRoot {
    public static void main(String[] args) {
        System.out.println(findNthRootOfM(4,626));
    }
    public static int findNthRootOfM(int n, int m) {
        // Write your code here.
        int arr[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i] = i+1;
        }
        int start = 1;
        int end = m-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            int power = pow(arr[mid],n);
            if(power>m)
            {
                end = mid-1;
            }
            else if(power==m)
            {
                return arr[mid];
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
    public static int pow(int n, int p)
    {
        if(p==0)
        {
            return 1;
        }
        return n*pow(n,p-1);
    }
}
