package Binary_search;

import java.util.Arrays;
import java.util.*;
public class first_program_code {
    public static void main(String[] args){
    int[] arr={1,2,3,4,5,6,7,8,9,10,13,15,17};
        System.out.println(code_for_BS(arr,87));

    }
    static int code_for_BS(int[] arr, int target){
        int s=0;
        int e=arr.length-1;

        while(s<=e) {
            int mid= s+(e-s)/2;

            if (arr[mid] < target) {
                s = mid + 1;
            }
            else if (arr[mid]> target) {
                e = mid - 1;
            }
            else {
                return mid;
            }
        }

return -1;
    }
}
