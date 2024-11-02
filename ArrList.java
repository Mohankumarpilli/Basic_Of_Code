import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrList<I extends Number> {
    public static void main(String[] args) {
        String s = "car";
        String t = "rat";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            if(hm1.containsKey(t.charAt(i))){
                hm1.put(t.charAt(i),hm1.get(t.charAt(i))+1);
            }else{
                hm1.put(t.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> i : hm.entrySet()){
            if(i.getValue() != hm1.get(i.getKey())){
//                return false;
                System.out.println("true");
            }
        }
    }
}
