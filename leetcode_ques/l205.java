package leetcode_ques;

public class l205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("leet","code"));
    }
    static boolean isIsomorphic(String s, String t) {
        int [] arr1=new int[s.length()];
        int n =s.length();
        for(int i=0;i< n;i++){
            arr1[i]=(int)s.charAt(i);
        }

        int [] arr2=new int[n];
        for(int i=0;i< n ;i++){
            arr2[i]=(int)t.charAt(i);
        }
        int[] arr11=new int[n];//for s
        int[] arr21=new int[n];//for t

        int sum=0;

        for(int i=0; i < n ;i++){
            for(int j=0; j < n ; j++){
                if(arr1[i]==arr1[j]){
                    sum = sum + j;
                }
            }
            arr11[i]=sum;
            sum=0;
        }
        sum=0;
        for(int i=0;i<n;i++){
            for(int j=0; j<n ;j++){
                if(arr2[i]==arr2[j]){
                    sum = sum + j;
                }
            }
            arr21[i]=sum;
            sum=0;
        }
        int i=0;
        while(i< n ){
            if(arr11[i]==arr21[i]){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
