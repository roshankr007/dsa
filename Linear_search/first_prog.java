package Linear_search;

import java.util.ArrayList;
import java.util.Scanner;

public class first_prog {
    public static void main(String[] args) {
        //search in the array , return the index if item is found else return -1

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n =scn.nextInt();
        int[] arr =new int[n];
        for(int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("enter the element you want to search");
        int key=scn.nextInt();

       int result= search(arr,key);
        System.out.println(result);
    }
    static int search(int[] array,int k)
    {
        for(int i =0;i<array.length; i ++)
        {
            if (array[i] == k)
            {
                return i;
            }

        }
        return -1;
    }
}
