class hollow_rhombus{
    public static void main(String[] args) {
        int n =5;
        for(int i =1;i<=n;i++){
            for(int j =n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                if(j==1 || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j =n-1 ;j>=i; j--){
                if(i==1|| i==j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}