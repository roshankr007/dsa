package Linear_search;

public class even_no_of_digits {
    public static void main(String[] args) {
    int[] arr={12,345,72,891,1245};
//        System.out.println(find_even_numbs(arr));
        System.out.println(digits2(125431));
    }

    //method to find numbers containing even digits in an array.
    static int find_even_numbs(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(digits(arr[i])% 2==0 ){
                count++;
            }
        }
        return count;
    }

//count the no of digits in a number, returns the same.
    static int  digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

//optimized method for digits method:
    static int digits2(int num){
        int count=0;
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num)+1);
    }
}
