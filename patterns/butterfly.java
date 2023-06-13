class butterfly{
    public static void main(String[] args) {
        int n =4;
        for(int i =1;i<=n;i++){
            //for 1st half stars
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            //for 1st half spaces
            for(int j =1 ;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // for 1st half stars at the end
            for(int j=1;j <=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half: we run the loop from greater to the smaller number to reverse the pattern .
        for(int i =n;i>=1;i--){
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            for(int j =1 ;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j <=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}