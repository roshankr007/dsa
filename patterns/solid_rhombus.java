class solid_rhombus{
    public static void main(String[] args) {
//my code
        //        for(int i=1;i<=4;i++){
//            for(int j =1;j<=9;j++){
//                if((i+j)<=5 || (i+j)>9){
//                    System.out.print(" ");
//                }
//                else{
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//best code

    int n =9;
    for(int i =1;i<=n;i++){
        for(int j =n-i;j>=1;j--){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}