import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                sum += hm.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String ip = "192.168.1.0";
        String[] ar = ip.split("\\.");
        for (String i : ar){
            int x = Integer.parseInt(i);
            if(x < 0 && x > 255){
                System.out.println("false");
            }
        }
    }
}
