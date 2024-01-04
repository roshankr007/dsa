package leetcode_ques;

public class ugly_no {
    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }
    static boolean isUgly(int n) {
        while(true){
            if(n==0){
                return false;
            }
            while(n%2==0){
                n=n/2;
            }
            while(n%3==0){
                n=n/3;
            }
            while(n%5==0){
                n=n/5;
            }
            if(n==1){
                return true;
            }
            else if(n!=1){
                return false;
            }
        }
    }
}
//https:leetcode.com/problems/ugly-number/