package questions;

import java.util.ArrayList;
import java.util.Arrays;

public class max_item {
    public static void main(String[] args) {
        int[] arr1={1,24,42,13,51};
//        max_value(arr1);
        reverse(arr1);

    }
    static void max_value(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("maximum value is " + max);
        System.out.println("minimum vlaue is " + min);
    }

    static void reverse(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            swap(arr,start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr1, int a, int b ){
        int temp;
        temp=arr1[a];
        arr1[a]=arr1[b];
        arr1[b]=temp;
    }

}
