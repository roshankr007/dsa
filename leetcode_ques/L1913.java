package leetcode_ques;
//import java.util.*;
public class L1913 {
    public static void main(String[] args) {
    int[] nums={10,10,10,10};
        System.out.println(maxProductDifference(nums));
    }
    static int maxProductDifference(int[] nums) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE-1;
        int p=0,q=0;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE+1;
        for(int i=0;i<nums.length;i++){
            if(max1<nums[i]){
                max1=nums[i];
                p=i;
            }

            if(min1>nums[i]){
                min1=nums[i];
                q=i;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(min2>nums[j] && j!=q){
                min2=nums[j];
            }
            if(max2<nums[j] && j!=p){
                max2=nums[j];
            }
        }
        return (max1*max2)-(min1*min2);
    }
}
