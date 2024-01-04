package leetcode_ques;
import java.util.Arrays;
public class plusOne {
    public static void main(String[] args) {
        int[] digits={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    static int[] plusOne(int[] digits) {
        long num=0;int count=0;
        for(int i=0;i< digits.length; i++){
            num = num*10 + digits[i];
        }

        num=num+1;
        long temp=num;

        while(temp>0){
            temp=temp/10;
            count++;
        }

        int[] arr= new int[count];
        int i=arr.length-1;

        while(num > 0 && i>-1){
            arr[i] = (int)num % 10;
            num = num/10;
            i--;
        }
        return arr;
    }
}
