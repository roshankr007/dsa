package leetcode_ques;

public class happy_number {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    static boolean isHappy(int n) {
        int a=0,temp=n,pow;
        while(true){
            while(temp>0){
                pow= temp%10;
                a= a + pow*pow;
                temp= temp/10;
            }
            temp=a;
            a=0;
            if(temp==1){
                return true;
            }
            else if(temp==4 || temp==16 || temp==37 || temp==52 || temp==29 || temp==85 || temp==89 || temp==145 || temp==42 || temp==20){
                return false;
            }
        }

    }
}
//https://leetcode.com/problems/happy-number/
