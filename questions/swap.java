package questions;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr= {2,4,5,23,4};
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr1, int a, int b ){
        int temp;
        temp=arr1[a];
        arr1[a]=arr1[b];
        arr1[b]=temp;
    }
}
