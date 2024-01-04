package leetcode_ques;
import java.util.*;
public class L1637 {
    public static void main(String[] args) {
    int[][] points= new int[6][2];
    Scanner sc= new Scanner(System.in);
    for(int i=0;i< points.length;i++){
        for( int j=0;j<2;j++){
        points[i][j]=sc.nextInt();
        }
    }
//        System.out.println(maxWidthOfVerticalArea(points));
    }
//    static int maxWidthOfVerticalArea(int[][] points) {
//        int curr_area=0,final_area=0;
//        for( int i=0;i<points.length;i++){
//            for( int j=i;j< points.length;j++){
//                curr_area=points[i][0]-points[j][0];
//                if(curr_area<0) {
//                    curr_area=curr_area * -1;
//                }
//                if(curr_area>final_area) final_area = curr_area;
//            }
//        }
//        Arrays.sort(arr);
//        return final_area;
//    }
}
