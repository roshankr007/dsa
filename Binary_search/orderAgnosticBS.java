package Binary_search;
class orderAgnosticBS{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,12,23,45,56,78,89,99,100};
        int [] arr1={100,99,89,78,67,56,45,34,33,23,20,12};
        System.out.println(order_Agnostic(arr1,0));
    }
    static int order_Agnostic(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[s]<arr[e]){
                //code for ascending order array
                if(target<arr[mid]){
                    e=mid-1;
                }
                else if(target>arr[mid]){
                    s=mid+1;
                }
                else{
                    return mid;
                }
            }
            else{
                //code for descending order array
                if(target<arr[mid]){
                    s=mid+1;
                }
                else if(target>arr[mid]){
                    e=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}