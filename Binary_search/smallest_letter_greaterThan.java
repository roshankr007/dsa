package Binary_search;

class smallest_letter_greaterThan{
    public static void main(String[] args) {
char[] c={'a','b','c','e','h'};
        System.out.println(nextGreatestLetter(c,'d'));
    }
    static char nextGreatestLetter(char[] letters, char target) {
     int start=0;
     int end=letters.length-1;

     while (start<=end){
         int mid=start+(end-start)/2;
         if( target < letters[mid]){
             end =mid-1;
         }
         else{
                start=mid+1;
         }
     }
return letters[start%letters.length];
    }
}