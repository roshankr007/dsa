import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;
class multi_arrayList{
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        // initialisation : creating objects for the list inside the list.
        for(int i =1;i <=3;i++)
        {
            list.add(new ArrayList<>());
        }

        //adding elements:
        for(int i =0 ; i<3 ; i++){
            for(int j=0 ; j< 3 ; j++){
                list.get(i).add(scn.nextInt());       // get th list at ith index and the calls the add method to input the user input value into that list

            }
        }
        System.out.println(list);            // to print simply do println.
    }
}