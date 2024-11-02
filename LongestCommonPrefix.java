import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        //System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs));
        int time = 0;
        int x = 4;
        int[] arr = {3,6,7,11};
        //System.out.println(minEatingSpeed(arr, 8));
        HashSet<List<Integer>> ans = new HashSet<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        s1.add(34);
        s1.add(45);
        ans.add(s1);
        List<List<Integer>> ar = new ArrayList<>();
        for(List<Integer> i : ans){
            ar.add(i);
        }
        System.out.println(ar);
    }
    public static int reqtime(int[] arr, int time){
        int takentime = 0;
        for(int i=0;i<arr.length;i++){
            double x = (double) arr[i] /time;
            takentime += Math.ceil(x);
        }
        return takentime;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i = 0;i < piles.length;i++){
            max = Math.max(piles[i],max);
        }
        int i = 1;
        int j = max;
        int ans = 0;
        while(i<=j){
            int mid = (i+j)/2;
            if(reqtime(piles,mid) <= h){
                ans = mid;
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        return ans;
    }
}