package leetcode_ques;

import java.util.ArrayList;
import java.util.Arrays;

public class L347 {
    public static void main(String[] args) {
        int[] arr={-1,-1};
//        System.out.println(Arrays.toString(topKFrequent(arr, 1)));
        System.out.println('a'-'b');
    }
    static int find_MAX(int[] h) {
        int max=Integer.MIN_VALUE,idx=0;
        for(int i=0;i<h.length;i++) {
            if(h[i]>max){
                max=h[i];
                idx=i;
            }
        }
        h[idx]=-1;
        return idx;
    }
static int[] topKFrequent(int[] nums, int k){
    int[] a= new int[nums.length];
    int[] h=new int[100000];
    int min=Integer.MAX_VALUE;

    for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];
        }
    }
    for(int i=0;i<nums.length;i++){
        a[i]=nums[i]+min;
    }
    min=min*-1;
    for(int i=0;i<nums.length;i++){
        h[a[i]] +=1;
    }
    int[] ans=new int[k];

        for( int i=0;i<k;i++){
           int index=find_MAX(h); // here we have to return the index of max in hash array 'h
           ans[i]=index-min;

        }

        return ans;
    }

}

