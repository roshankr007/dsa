package Linear_search;

public class single_element_in_sorted_list {
    public static void main(String[] args) {
        int [] arr={1,1,2};
        System.out.println(singleNonDuplicate(arr));
    }
    static int singleNonDuplicate(int[] nums) {
        int i=0,j=0,k=0,ans=0;

        //for length 1;
        if(nums.length==1){
            ans=nums[0];
        }

        //for testcase with array length 3.
        else if (nums.length==3) {

            if(nums[0]==nums[1]){
                ans=nums[2];      //duplicate at index 2 like [1,1,2].
            }
            else{
                ans=nums[0];        //duplicate at index 0 like [1,2,2].
            }
        }

        //for rest cases
        else
        {
            for (i = 0; i < nums.length; i++)
            {
                j = i + 1;
                k = i + 2;
                //if k is ant end and single digit occurrence hasn't been found
                if(k==nums.length-1){
                    ans=nums[k];
                    break;
                }

                else if (nums[i] != nums[j] && nums[j] != nums[k])
                {
                        ans = nums[j];
                        break;

                }
            }
        }
        return ans;
    }

    /* todo : to check for test case like 1,2,2 */
}
