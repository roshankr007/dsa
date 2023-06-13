package Linear_search;
import java.util.*;
public class First_and_Last_pos {
    public static void main(String[] args){
           int[] arr={1};
        System.out.println(Arrays.toString(searchRange(arr,1)));
    }
    static int[] searchRange(int[] nums, int target) {
        int start=-1,end=-1;
        for(int i=0 ; i<nums.length; i++)
        {
            if(nums[i]==target)
            {
                start= i;
                break;
            }
        }
        for(int j=nums.length-1; j>=0; j--)
        {
            if(nums[j]==target)
            {
                 end= j;
                break;
            }
        }
        return new int[]{start, end};
    }
}
