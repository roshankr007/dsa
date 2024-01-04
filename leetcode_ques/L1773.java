package leetcode_ques;
import java.util.*;
public class L1773 {
    public static void main(String[] args) {
        List<List<String>> L= new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        List<String> l3 = new ArrayList<>();
        l1.add("phone");
        l1.add("blue");
        l1.add("pixel");

        l2.add("computer");
        l2.add("silver");
        l2.add("lenovo");

        l3.add("phone");
        l3.add("gold");
        l3.add("iphone");

        L.add(l1);
        L.add(l2);
        L.add(l3);
        System.out.println(countMatches(L,"color","silver"));
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            if(ruleKey=="type"){
                if(items.get(i).get(0)==ruleValue){
                    count++;
                }
            }
            else if(ruleKey=="color"){
                if(items.get(i).get(1)==ruleValue){
                    count++;
                }
            }
            else{
                if(items.get(i).get(2)==ruleValue){
                    count++;
                }
            }
        }
        return count;
    }
}
