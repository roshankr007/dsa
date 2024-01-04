package leetcode_ques;
import java.util.*;
public class L27 {
    public static void main(String[] args) {
    int[] arr={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr,2));

        System.out.println(Arrays.toString(arr));
    }
    public static  int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }
        }
        int p=0,q=nums.length-1;

        for(int i=0;i<count;i++){
            //to find first -1 from left
            for(int j=0;j<nums.length;j++){
                if(nums[j]==val){
                    p=j;
                    break;
                }
            }
            for(int j=nums.length-1;j>0;j--){
                if(nums[j]!=val){
                    q=j;
                    break;
                }
            }
            if(p>q){
                return nums.length-count;
            }
            else {
                int temp = nums[p];
                nums[p] = nums[q];
                nums[q] = temp;
            }
        }
        return nums.length-count;
    }
}

