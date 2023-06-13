package Binary_search;

public class ceilingfloor_of_no {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8,9,11,12,13,14,14,15,15};
        System.out.println(ceil(arr,12));
    }
    static int ceil(int[] arr, int target){
        int start=0;
        int end =arr.length-1;
         if(target>arr[arr.length-1]){
            return -1;
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }

     static int  floor(int [] arr, int target){
         int start=0;
         int end =arr.length-1;
         if (target<arr[0]){
             return -1;
         }
         while (start<=end){
             int mid=start+(end-start)/2;
             if(target<arr[mid]){
                 end=mid-1;

             }
             else if(target>arr[mid]){
                 start=mid+1;
             }
             else{
                 return arr[mid];
             }
         }
         return arr[end];
     }
}
