class inverted_half_pyramid{
    public static void main(String[] args) {
        int n=4,k=1;
        for(int i =1;i<=n;i++){
            for(int j =n;j>=i;j--){
                System.out.print(k);
            }
            k++;
            System.out.println();
        }
    }
}