package leetcode_ques;
//not optimised
public class L121 {
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices){
        int cur_profit=0,max_profit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i;j< prices.length;j++){
                cur_profit=prices[j]-prices[i];
                if(cur_profit>max_profit){
                    max_profit=cur_profit;
                }
            }
        }
        return max_profit;
    }
}
