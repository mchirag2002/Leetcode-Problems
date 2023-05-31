import java.util.ArrayList;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int arr[] = {3,2,1,18,18,9};
        System.out.println(linear(arr,18,0));
        System.out.println(linearLast(arr,18,arr.length-1));
        System.out.println(boolSearch(arr,18,0));
        listAll(arr, 18, 0);
        System.out.println(list);
        System.out.println(find_list(arr, 18, 0, new ArrayList<Integer>()));
    }

    private static boolean boolSearch(int[] arr, int target, int index) {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || boolSearch(arr,target,index+1);
    }

    static int linear(int arr[], int target, int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return linear(arr,target,index+1);
    }
    static int linearLast(int arr[], int target, int index)
    {
        if(index==-1)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        return linearLast(arr,target,index-1);
    }
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static void listAll(int arr[], int target, int index)
    {
        if(index== arr.length)
        {
            return;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        listAll(arr, target, index+1);
    }
    static ArrayList<Integer> find_list(int arr[], int target, int index, ArrayList<Integer> list1)
    {
        if(index==arr.length)
        {
            return list1;
        }
        if(arr[index]==target)
        {
            list1.add(index);
        }
        return find_list(arr, target, index+1, list1);
    }
}
