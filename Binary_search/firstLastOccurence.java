package Binary_search;

public class firstLastOccurence {
    public static void main(String[] args) {
int [] arr={5,5,6,7,7,7,8,8,10};
//        System.out.println(firstOccurence(arr,7));
    execute(arr,7);
    }
    static void execute(int[] arr,int target){
        System.out.println(firstOccurence(arr,target));
        System.out.println(lastOccurrence(arr,target));
    }

    static int firstOccurence(int[] arr, int target){
        int start=0;
        int end=arr.length;
        while (start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                    while(arr[mid-1]==target){
                        mid=mid-1;
                    }
                    return mid;
            }
        }
        return -1;
    }

    static int lastOccurrence(int[] arr,int target){
        int start=0;
        int end=arr.length;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                while(arr[mid+1]==target){
                    mid=mid+1;
                }
                return mid;
            }
        }
        return-1;
    }
}
