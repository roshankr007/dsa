package leetcode_ques;

//import java.util.Arrays;
import java.util.*;

public class L54_imp {
    public static void main(String[] args) {
        int[][] matrix= new int[3][3];

        int num=1;
//        Scanner sc= new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                matrix[i][j]=num;
                num++;
            }
        }
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j< matrix[i].length;j++){
//                System.out.println((matrix[i][j]));
//            }
//        }
        spiralOrder(matrix);
    }
    static void spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int r=0,c=0,nums=0,dir=0;
        int first_row=0,first_col=0,last_row=0,last_col=0;
        int total=matrix[0].length* matrix.length;

        while(nums< total){
               if(dir==0){                      //move right
                   while(c < matrix.length- last_col-first_col){
                       l.add(matrix[r][c++]);
                       nums++;
                   }
                   first_row++;
                   dir=-2;
               }
               else if(dir==-2){
                   c--;
                   while(r< matrix.length-first_row - last_row){
                       l.add(matrix[r++][c]);
                       nums++;
                   }
                   last_col++;
                   dir=-1;
               }
               else if(dir==-1){
                   r--;
                   while(c< matrix.length-last_col -first_col){
                       l.add(matrix[r][c-last_col]);
                       c--;
                       nums++;
                   }
                   last_row++;
                   dir=2;
               }
               else if(dir==2) {
                   c++;
                   while (r < matrix.length - first_row - last_row) {
                       l.add(matrix[r - last_row][c]);
                       nums++;
                       r--;
                   }
                   first_row++;
                   dir = 0;
               }
        }
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

    }
}
