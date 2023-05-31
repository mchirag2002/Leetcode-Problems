public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(paths(3,7,0, 0, 0));
    }
    static int paths(int m, int n, int count, int x, int y)
    {
        if(x==m-1 && y==n-1)
        {
            return 1;
        }
        int a = 0;
        if(x<m-1)
        {
            a += paths(m,n,count,x+1,y);
        }
        if(y<n-1)
        {
            a += paths(m,n,count,x,y+1);
        }
        return count+a;
    }

}
