package leetcode_ques;
import java.util.*;
public class L2343 {

    public static void main(String[] args) {
        String[] nums={"102","473","251","814"};
        int[][] queries= new int[4][2];
        Scanner sc= new Scanner(System.in);
        for( int i=0;i< queries.length;i++){
            for(int j=0;j<2;j++){
                queries[i][j]= sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(smallestTrimmedNumbers(nums,queries)));
    }

    static int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int[] s = new int[nums.length];
        int k = 0, trim = 0, j = 0, index = 0, target = 0;

        while(j< queries.length) {
            trim = queries[j][1];
            k=queries[j][0];
            for (int i = 0; i < nums.length; i++) {
                s[i] = Integer.parseInt(nums[i].substring(nums.length - trim));
            }
            //now we have to find the index of kth smallest number in s:
            int[] copy = new int[s.length];
            System.arraycopy(s, 0, copy, 0, copy.length);
            Arrays.sort(copy);
            target = copy[k - 1];
            for (int i = 0; i < s.length; i++) {
                if (s[i] == target) {
                    index = i;
                    break;
                }
            }
            ans[j] = index;
            j++;
        }
        return ans;
    }
}
