package leetcode_ques;

public class L242 {
    public static void main(String[] args) {
    String s="anagram";
    String t="nagaram";
        System.out.println(isAnagram(s,t));

    }
    static public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }

        // we need 4 arrays , 2 for hashing and  to calculate ascii values of each characters
        int[] a1=new int[s.length()];
        int[] a2=new int[t.length()];

        int[] h1=new int[27];
        int[] h2=new int[27];

        for(int i =0;i<s.length();i++){
            a1[i]=s.charAt(i)-'a';
        }
        for(int i =0;i<s.length();i++){
            a2[i]=t.charAt(i)-'a';
        }

        for(int i=0;i<s.length();i++){
            h1[a1[i]]+=1;
        }
        for(int i=0;i<s.length();i++){
            h2[a2[i]]+=1;
        }
        int i=0,j=0;
        while(i<h1.length ){
            if(h1[i]!=h2[j]){
                return false;
            }
            i++;j++;
        }
        return true;
    }
}
