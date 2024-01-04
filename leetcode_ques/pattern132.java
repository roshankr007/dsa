package leetcode_ques;

import java.sql.SQLOutput;

public class pattern132 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(find(nums));
    }
    static boolean find(int[] nums){
        for(int i=nums.length-1;i>0;i--){
            for(int j=i-1;j>0;j--){
                if(nums[j]>nums[i]){
                    for(int k=j-1;k>-1;k--){
                        if(nums[k]<nums[j] && nums[k]<nums[i]){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
