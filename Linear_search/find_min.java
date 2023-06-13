package Linear_search;

public class find_min {
    public static void main(String[] args) {
        int [] arr={1,23,3,4,2,8};
        System.out.println(min_no(arr));
    }
    static int min_no(int [] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0; i <arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
