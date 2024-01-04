package leetcode_ques;
import java.util.*;
public class L2513 {

    public static void main(String[] args) {
        System.out.println(minimizeSet(2,4,8,2));
    }
    static int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int [] arr1 = new int[uniqueCnt1];
        int [] arr2 = new int[uniqueCnt2];
        int num=1,i=0;
         while(i<arr1.length){
            if(num % divisor1 != 0){
                arr1[i]=num;
                i++;
                num++;
            }
            else{
                num++;
//                i++;
            }
        }
        num=1;
        int j=0;
        while(j< arr2.length){
            if((num % divisor2 != 0) && (BS(arr1,num,0,arr1.length-1) == -1)) {
                arr2[j]=num;
                    j++;
            }
            num++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        if(arr1[arr1.length-1] > arr2[arr2.length-1]){
            return arr1[arr1.length-1];
        }
        else{
            return arr2[arr2.length-1];
        }

    }
    static int BS(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid= (s+e)/2;
        if(arr[mid]>target) return BS(arr,target,s,mid-1);
        else if(arr[mid] < target ) return BS(arr, target, mid+1, e);
        else return mid;
    }
}
