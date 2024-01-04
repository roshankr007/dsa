package leetcode_ques;
import java.util.*;

public class counting_bits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(count(5)));
    }

    static int[] count(int n){
        String temp;
        int count=0;
        int [] ret=new int[n+1];
        String[] arr=new String[n+1];
        for(int i=0;i<n+1;i++){
            arr[i]= Integer.toBinaryString(i);
        }
        for(int i =0;i<n+1;i++){
            temp=arr[i];
            int j =0;
            count=0;
            while(j<temp.length()){

                if(temp.charAt(j)=='1'){
                    count++;
                }
                j++;
            }
            ret[i]=ret[i]+count;
        }
        return ret;
    }
}
