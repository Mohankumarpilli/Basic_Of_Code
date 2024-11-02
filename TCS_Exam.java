import java.util.*;

public class TCS_Exam {
    public static void main(String[] args) {
//        int[] arr = {3,4,-7,1,3,3,1,4,2};
//        int i=0;
//        int j=0;
//        int val=7;
//        ArrayList<Integer> List = new ArrayList<>();
//        int sum=0;
//        while(j<arr.length && i<arr.length){
//            if(sum<val){
//                sum+=arr[j];
//                j++;
//            }
//            if(sum==val){
//                for(int k=i;k<j;k++){
//                    List.add(arr[k]);
//                }
//                sum-=arr[i];
//                i++;
//            }
//            if(sum>val){
//                sum-=arr[i];
//                i++;
//            }
//        }
//        for(i=0;i<List.size();i++){
//            System.out.print(List.get(i)+" ");
//        }
        String s = "abb";
        String t = "egg";
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm1.containsKey(s.charAt(i))){
                hm1.replace(s.charAt(i),hm1.get(s.charAt(i))+1);
            }else{
                hm1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(hm2.containsKey(t.charAt(i))){
                hm2.replace(t.charAt(i),hm2.get(t.charAt(i))+1);
            }else{
                hm2.put(t.charAt(i),1);
            }
        }
        int[] arr1 = new int[hm1.size()];
        int[] arr2= new int[hm2.size()];
        int k=0;
        for(Map.Entry i : hm1.entrySet()){
            arr1[k] =(int) i.getValue();
            k++;
        }
        k=0;
        for(Map.Entry i : hm2.entrySet()){
            arr2[k] =(int) i.getValue();
            k++;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
        }
    }
}
