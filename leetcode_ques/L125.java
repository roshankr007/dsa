package leetcode_ques;

public class L125 {
    public static void main(String[] args) {
    String s =  "OP";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){
        //applying 2 pointer method
        int i=0,j=s.length()-1;
        boolean b=true;
        String str=s.toLowerCase();
        while(i<j){
            if((str.charAt(i) >=97 && str.charAt(i)<=122) || (str.charAt(i) >=48 && str.charAt(i)<=57)){ // if the character at ith position is an alphabet or not
                if((str.charAt(j)>=97 && str.charAt(j)<=122) || (str.charAt(j) >=48 && str.charAt(j)<=57)){// if character at j is also an alphabet
                    if(str.charAt(i)==str.charAt(j)){
                        i++;
                        j--;
                    }
                    else{
                        b=false;
                        break;
                    }
                }
                else{
                    j--;
                }
            }
            else{
                i++;
            }
        }
        return b;
    }
}
