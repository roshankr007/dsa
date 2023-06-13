class half_pyramid_1{
    public static void main(String[] args) {
//       my code:
//        int k=4;
//        for(int i=1;i<=4;i++){
//            for(int j =1;j<=k;j++){
//                System.out.print("*");
//            }
//            k--;
//            System.out.println();
//        }
        //main code
    int n=4;
    for(int i=n; i>=1; i--){
        for(int j=1; j<=i ; j++ ){
            System.out.print("*");
        }
        System.out.println();
    }

    }
}