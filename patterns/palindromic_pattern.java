class palindromic_pattern{
    public static void main(String[] args) {
        int n =5,k;
        for(int i=1;i<=n;i++){
            //for spaces

            for(int j =1; j <=n-i; j++){
                System.out.print(" ");
            }
            k=i;
            for(int j=1;j<=i ; j++){
                System.out.print(k);
                k--;
            }
            //right side half pyramid
            for(int j=2;j<=i;j++){

                System.out.print(j);

            }
            System.out.println();
        }
    }
}