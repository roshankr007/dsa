package leetcode_ques;

public class excel_sheet_idx {
    public static void main(String[] args) {
        titleToNumber("ZY");
//        System.out.println(titleToNumber("ZY"));
    }
    static int titleToNumber(String columnTitle) {
        //26x+y ,x=pos at tens place and y=pos at ones place
        String s= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String a= columnTitle;
        int idx=0;
        int char_idx=0;
        if(a.length()==1){
            idx= s.indexOf(columnTitle)+1;
        }else{
            for(int i=0; i<a.length();i++){
                int j =(a.length()-1)-i;
                char_idx=s.indexOf(a.charAt(i))+1;
                idx= idx + (int)(Math.pow(26,j) * char_idx);
                System.out.println(char_idx);
            }
        }
        return idx;
    }
}
//https://leetcode.com/problems/excel-sheet-column-number/
//best solution :

//class Solution {
//    public int titleToNumber(String columnTitle) {
//        int n = columnTitle.length()-1;
//        int sum=0;
//        for(int i=0;i<=n;i++)
//        {
//            sum+=Math.pow(26,n-i) * (columnTitle.charAt(i)-64);;
//        }
//        return sum;
//    }
//}