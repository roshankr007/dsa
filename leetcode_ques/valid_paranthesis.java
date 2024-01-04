package leetcode_ques;

public class valid_paranthesis {
    public static void main(String[] args) {
    String s = "()[]{}";
        System.out.println(isValid(s));
    }
    static int top=-1;
    static char[] stack= new char[3];
    public static void stack_push(char c){
        top++;
        stack[top]=c;
    }
//    public static  void stack_pop(){
////        char pop = stack[top];
//        top--;
////        return pop;
//    }
    public static boolean isValid(String s) {
        int i=0;
        boolean bool=false;
        while(i<s.length())
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack_push(s.charAt(i));
            }

            if(s.charAt(i) == ')' && stack[top]=='(') {
                top--;
                bool = true;
            }
            else if(s.charAt(i) == '}' && stack[top]=='{'){
                top--;
                bool=true;
            }
            else if (s.charAt(i) == ']' && stack[top]=='['){
                top--;
                bool= true;
            }
            else{
                return false;
            }
            i++;
        }
        return bool;
    }
}