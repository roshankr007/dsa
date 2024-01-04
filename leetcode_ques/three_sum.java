package leetcode_ques;
import java.util.*;
public class three_sum {
    public static void main(String[] args) {
        int[] nums ={-1,0,1,2,-1,-4};
        List<List<Integer>> l =new ArrayList<>();
        l=threeSum(nums);
        for(int i=0;i<l.size();i++){

        }

////        System.out.println(Arrays.toString(threeSum(nums)));
//
//        int j=1;
//        int k=j+1;
//        List<List<Integer>> list= new ArrayList<>();
//        List<Integer> l= new ArrayList<>();
//        List<Integer> check= new ArrayList<>();
//        for(int i=0;i<nums.length;i++)
//        {
//            j=i+1;
//            for( ;j<nums.length;j++)
//            {
//                k=j+1;
//                while(k<nums.length)
//                {
//                    if((nums[i]+nums[j]+nums[k]) == 0)
//                    {
//                        //check if given pair is already present or not
//
//                        if((check.contains(i)&& check.contains(j)) || (check.contains(j)&& check.contains(k))  || (check.contains(i)&& check.contains(k)) ){
//
//                        }
//                        else {
//                            Collections.addAll(l, nums[i], nums[j], nums[k]);
//                            list.add(l);
//                            l.clear();
//                            Collections.addAll(check, i, j, k);
//                        }
//                    }
//                    k++;
//                }
//            }
//        }
//
//    for(int m=0;m<list.size();m++){
//        System.out.println(list);
//        }
    }
    static List<List<Integer>> threeSum(int[] nums){
        int j=1;
        int k=j+1;
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for( ;j<nums.length;j++)
            {
                k=j+1;
                while(k<nums.length)
                {
                    if((nums[i]+nums[j]+nums[k]) == 0)
                    {
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        list.add(l);
                    }
                    k++;
                }
            }
        }
        return list;
    }
}
