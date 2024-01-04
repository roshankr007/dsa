package leetcode_ques;

public class L2114 {
    public static void main(String[] args) {
        String[] s={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(s));
    }
    static int mostWordsFound(String[] sentences) {
        StringBuffer sb= new StringBuffer();
        int count=0,j=0,ans=0,k=0;
        for(int i=0;i<sentences.length;i++){
            sb.append(sentences[i]);
            count=0;
            while(sb.indexOf(" ")>0){
                k=sb.indexOf(" ");
                if(k>0){
                    count++;
                    sb.delete(0,k+1);
                }
                if(count+1>ans){ans=count;}
            }
        }
        return ans+1;
    }
}
