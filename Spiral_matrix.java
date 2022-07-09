import java.util.Arrays;

public class Spiral_matrix {
    public static void main(String[] args) {
        //to find the spiral of the matrix
        int [][] matrix = {{1},{2}};
        int n = 0;
        for (int i = 0; i < matrix.length; i++) {
            n+=matrix[i].length;
            System.out.println(Arrays.toString(matrix[i]));
        }
        int breadth = matrix.length, length = matrix[0].length, l=0, b=1, c=0;
        int[] arr = new int[n];

        for (int i = 0; length>1 ; i++) {
            l=0;
            b=1;
            int[][] m = new int[breadth][length];
            if(i>0)
            {
                length++;
                breadth++;
            }
            for(int j=i, x=0;j<breadth;j++, x++)
            {
                for (int k = i, y=0; k <length; k++, y++) {
                    m[x][y] = matrix[j][k];
                }
            }
            if(i>0)
            {
                length--;
                breadth--;
            }
//            System.out.println("m matrix - ");
//            for(int j=0;j<breadth;j++)
//            {
//                    System.out.println(Arrays.toString(m[j]));
//            }
            c = row_ltr(m, arr, l, length, c);
            length--;
            l = length;
            c = column_utd(m, arr, l, b, breadth, c);
            breadth--;
            b = breadth;
            length--;
            l = length;
            if(arr[arr.length-1]!=0)
            {
                break;
            }
            c = row_rtl(m, arr, l, length, c, b);
            breadth--;
            b = breadth;
            l=0;
            c = column_dtu(m, arr, l, c, b);
//            System.out.println(Arrays.toString(arr));
        }
        System.out.println(n);
        if(n==1)
        {
            arr[0] = matrix[0][0];
        }
        else if(length==1 && n==2)
        {
            arr[0] = matrix[0][0];
            arr[1] = matrix[1][0];
            System.out.println(Arrays.toString(arr));
        }
         if(arr[arr.length-1]==0)
        {

        arr[arr.length-1] = matrix[breadth][length];
        }



//
//        System.out.println("l - "+l);
//        System.out.println("b - "+b);
//        System.out.println("c - "+c);
//        System.out.println("length - "+length);
//        System.out.println("breadth - "+breadth);
//



        System.out.println(Arrays.toString(arr));


    }
    static int row_ltr(int[][] matrix, int[] arr, int l, int length, int c)
    {
        while(l<length){
            arr[c] = matrix[0][l];
            l++;
            c++;
        }
        return c;
    }
    static int column_utd(int[][] matrix, int[] arr, int j,int k, int breadth, int c)
    {
        while(k<breadth)
        {
            arr[c] = matrix[k][j];
            k++;
            c++;
        }
        return c;
    }
    static int row_rtl(int[][] matrix, int[] arr, int j, int length, int c, int k)
    {
        while(j>=0)
        {
            arr[c] = matrix[k][j];
            j--;
            c++;
        }
        return c;
    }
    static int column_dtu(int[][] matrix, int[] arr, int j, int c, int k)
    {
        while(k>0)
        {
            arr[c] = matrix[k][j];
            k--;
            c++;
        }
        return c;
    }
}
