package Linear_search;

public class Search_in_range {
    public static void main(String[] args) {
        int [] arr={1,2,44,54,12,53,34};
        System.out.println(search(arr,54,1,5));
    }
    static int search(int[] array,int k,int start,int end)
    {
        for(int i =start ; i<=end ; i++)
        {
            if (array[i] == k)
            {
                return i;
            }

        }
        return -1;
    }
}
