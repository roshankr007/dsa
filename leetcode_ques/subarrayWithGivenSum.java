package leetcode_ques;
import java.util.*;
//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
public class subarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        System.out.println(subarraySum(arr,5,12));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0,sum=0;

        for(;i<n;i++){
            innerloop:
            for(j=i;j<n;j++){

                sum=sum+arr[j];

                if(sum>s){
                    sum=0;
                    break innerloop;
                }
                if(sum == s){
                    Collections.addAll(list,i+1,j+1);
                    return list;
                }
            }
        }
        // int [] ret={-1};
        list.add(-1);
        return list;
    }
}
