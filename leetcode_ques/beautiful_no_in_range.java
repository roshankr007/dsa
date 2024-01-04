package leetcode_ques;

public class beautiful_no_in_range {
    public static void main(String[] args) {
        System.out.println(numberOfBeautifulIntegers(228,273,3));
    }
    static int numberOfBeautifulIntegers(int low, int high, int k) {
        int count_even = 0, count_odd = 0, count_beautiful = 0, count_digits=0;
        int temp;
            for (int i = low; i < high + 1; i++) {
                temp = i;
                count_even = 0;
                count_odd = 0;
                
                while(temp!=0){
                    temp=temp/10;
                    count_digits++;
                }
                if(count_digits%2==0) {
                    temp = i;
                    while (temp != 0) {
                        if (((temp % 10) % 2) == 0) {
                            count_even++;
                        } else {
                            count_odd++;
                        }
                        temp = temp / 10;

                        if ((count_even == count_odd) && (i % k == 0)) {
                            count_beautiful++;
                        }
                    }
                }
                else{

                }
            }


        return count_beautiful;
    }
}
