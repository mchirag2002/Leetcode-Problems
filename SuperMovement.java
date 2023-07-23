public class SuperMovement {
    public static void main(String[] args) {
        int[] a = {7,6,14,2,1};
        System.out.println(superMovement(a.length,a,5));
    }
    public static long superMovement(int n, int[] a, int k)
    {
        boolean[] visited = new boolean[n];
        long time = 0;
        for(int i=0;i<n;i++)
        {
            visited[i] = false;
        }
        int i=0;
        while(true)
        {
            if(!visited[i] && (i<n-1) && (i+k)<n && (Math.abs(a[i]-a[i+1])>Math.abs(a[i+k]-a[i+k+1])))
            {
                visited[i] = true;
                i+=k;
            }
            else if(!visited[i] && (i+k)<n)
            {
                visited[i] = true;
                i+=k;
            }
            else if(!visited[i] && i<n-1)
            {
                time+= Math.abs(a[i]-a[i+1]);
                i++;
            }
            else
            {
                break;
            }
        }
        return time;
    }

}
