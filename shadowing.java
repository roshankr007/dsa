class shadowing{
    static int x=90;           //higher level variable .it's scope is inside the class block
    public static void main(String[] args){
        System.out.println(x);     //prints 90
        int x=40;             //variable redecalered with the same name. it's scope is inside psvm
        System.out.println(x);    // prints 40 . the higher level is shadowed here.
        fun();                    // prints 90(value of higher level variable) again as the function fun
                                   // is written outsid the scope of  the lower level variable.
    }
    static void fun(){
        System.out.println(x);    // for this only x=90 is availabe as x=40 is in  the local scope.
    }
}//it is only effective in class variables and does not work in methods
