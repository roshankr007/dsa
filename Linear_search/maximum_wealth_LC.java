package Linear_search;

public class maximum_wealth_LC {
    public static void main(String[] args) {
        int[][] arr={
                {312,31,413},
                {2312,1334,535},
                {1313,7564,8535}
        };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts){
        int[] sum= new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum[i]=sum[i]+accounts[i][j];
            }
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < sum.length; i++) {
            if(sum[i]>max){
                max=sum[i];
            }
        }
        return max;
    }
}
