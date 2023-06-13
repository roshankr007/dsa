package Linear_search;

import java.util.Arrays;

public class searchInString {
    public static void main(String[] args) {
        String string="roshan";
        char target='r';
//        System.out.println(search(string, target));
        System.out.println( Arrays.toString(string.toCharArray()));
    }
    static boolean search(String string,char target){
        for(int i =0;i< string.length();i++){
            if(string.charAt(i)==target){
                return true;
            }

        }
        return false;
    }

    //using for each loop and toCharArray method .
    static boolean search2(String string,char target){
        for(char c :string.toCharArray()){
            if(c==target){
                return true;
            }

        }
        return false;
    }
}
