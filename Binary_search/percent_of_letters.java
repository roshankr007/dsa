package Binary_search;

public class percent_of_letters {
    public static void main(String[] args) {
        String s = "kue";
        System.out.println(percentageLetter(s, 'e'));
    }

     static int percentageLetter(String s, char letter) {
        char[] ch = s.toCharArray();
        int count = 0;



            for (int i = 0; i < ch.length ; i++) {
                if (ch[i] == letter) {
                    count++;
                }
            }
            int result = (int) (count *100/ ch.length);
            return result;
        }
    }

