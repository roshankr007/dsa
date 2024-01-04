package leetcode_ques;
import java.util.Arrays;
public class mergesortedLists {
    public static void main(String[] args) {
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};
        System.out.println(Arrays.toString(merge(nums1, 3, nums2, 3)));
    }
    static public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0,j=0;
        while(i<m-1 ||j<n ){
            if (nums1[i] > nums2[j]){
                for(int k = m-1 ; k>i ; k--){
                    nums1[k]=nums1[k-1];
                }
                nums1[i]=nums2[j];
                j++;
                i++;
            }
            else{i++;}
        }
        return nums1;
    }
}
