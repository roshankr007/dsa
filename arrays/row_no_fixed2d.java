package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class row_no_fixed2d {
    public static void main(String[] args){
        int[][] arr= new int[3][3];
        Scanner scn = new Scanner(System.in);

        for (int r=0;r< arr.length; r++){
            for(int c=0; c< arr[r].length; c++){
                arr[r][c]= scn.nextInt();
            }
        }

        //printing using for each loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
