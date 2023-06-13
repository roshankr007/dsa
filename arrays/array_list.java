package arrays;
import java.util.*;
import java.util.ArrayList;

public class array_list {
    public static void main(String [] args){
        //syntax
        ArrayList<Integer> list = new ArrayList<>();

        //to add
        list.add(23);
        list.add(34);
        list.add(98);
        list.add(65);


        // to print
        System.out.println(list);  // it internally calls to string method.
        list.set(0,34);            // to update the 0th index as 99.
        list.remove(2);      // removes index no 2;
        list.get(2);            // pass index syntax here

    Scanner sc= new Scanner (System. in );
    for(int i=0;i<4;i++){
        list.add(sc.nextInt());     // adds continuoously into the list
    }
    // to print using a loop
        for(int i=0;i<4;i++){
            System.out.println(list.get(i));
        }
    }
}
