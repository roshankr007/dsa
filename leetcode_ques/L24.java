package leetcode_ques;

public class L24 {
    public static void main(String[] args) {
    int [] nums={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums)
    {
        int i=0,count=0;
        char[] arr= new char[nums.length];
        int j=0;
        while(i<nums.length)
        {
            count++;
            arr[i]=(char)nums[i];
            while((nums[i]==nums[j]) && (j< nums.length)){
                j++;
            }
            i=j;
        }
        j=count+1;
        for(;j<nums.length;j++){
            arr[j]=(char)'_';
        }
        return count;
    }
}
