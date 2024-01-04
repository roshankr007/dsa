package leetcode_ques;

public class L1422 {
    public static void main(String[] args) {
    String s;

    }
    //method 1: using loops:
    static int maxScore(String s) {
        int p=0,q=0,count_0=0,count_1=0,final_ans=0,curr_ans=0;
        while(p<(s.length()-1)){
            count_1=0;
            count_0=0;

            for(int i=0;i<=p;i++){
                if(s.charAt(i)=='0') count_0++;
            }
            for(int j=s.length()-1;j>p;j--){
                if(s.charAt(j)=='1') count_1++;
            }
            curr_ans=count_0+count_1;
            if(curr_ans>final_ans) final_ans=curr_ans;
            p++;
        }
        return final_ans;
    }
}
