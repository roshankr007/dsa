import java.lang.reflect.Array;
import java.util.Arrays;

class var_args{
    public static void main(String[] args) {
        fun(1,2,3,4,4);
    }

    static void fun(int ...v){         // to pass any length of arguments into a function
                                       // it will be treated as an array of arguments of the specified data type internally.
        System.out.println(Arrays.toString(v));
    }
}/*
we can also do something like this
 fun(int a , int b , string ...v)

 to call this function in orderly fashiion we have to pass the arguments :
 fun (3,5,"roshan ","rohit " );
 note : if we do not pass first 2 integer values then it will give us error
 also the variable length parameters must be the last in the list
 */