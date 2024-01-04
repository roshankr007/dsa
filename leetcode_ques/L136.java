package leetcode_ques;

public class L136 {
    public static void main(String[] args) {
    int[] nums={-1};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        int[] hash= new int[100001];
        //finding min of the array
        int min=Integer.MAX_VALUE;

        for(int i =0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(min);
        min=min*-1;
        //create the new array
        for(int i=0;i<nums.length;i++){
            nums[i]+=min;
        }
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]+=1;
        }
        for(int i =0;i<nums.length;i++){
            if(hash[nums[i]]==1){
                return nums[i]-min;
            }
        }
        return -1;
    }
}
