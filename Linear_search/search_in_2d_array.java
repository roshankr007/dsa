package Linear_search;
import java.util.*;;
public class search_in_2d_array {
    public static void main(String[] args) {
        int [][] arr={
                {21,42,53,64},
                {53,5,33},
                {32,65,23,22}
        };
        int target=33;
//        System.out.println(search(arr, target));
//        System.out.println(Arrays.toString(search2(arr, target)));
        System.out.println(Arrays.toString(max(arr)));
    }
    static boolean search(int[][] array,int target){
        for(int i=0;i<array.length;i++)
        {
            for(int j=0; j<array[i].length;j++)
            {
                if(array[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    //returning idexes :
    static int[] search2(int[][] array,int target){
        for(int i=0;i<array.length;i++)
        {
            for(int j=0; j<array[i].length;j++)
            {
                if(array[i][j]==target)
                {
                    return new int[]{i,j} ; // here an object of type array is created containing the va;ues of i and j .
                }
            }
        }
        return new int[]{-1,-1}; // here an object of array type is created containing values -1,-1.
    }

    //mac in 2d array
    static int[] max(int[][] arr){
        int max= arr[0][0];
        int i,j=0;
        for( i=0;i<arr.length;i++){
            for(j=0; j < arr[i].length ; j++){
                if(arr[i][j] > max){
                    max=arr[i][j];
                }
            }
        }

//
        return new int[]{max,i,j};
    }


}
