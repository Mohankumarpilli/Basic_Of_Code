import java.util.ArrayList;

public class Sub_Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        int ans1=Integer.MIN_VALUE;
        System.out.println(arr);
        /*for(int i=0;i< arr.size();i++){

            for(int j=i;j< arr.size();j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr.get(k);
                }
                ans.add(sum);
            }

        }*/


        //prefix array;
       /* int[] prefix=new int[arr.size()];
        prefix[0]=arr.get(0);
        for(int i=1;i< arr.size();i++){
            prefix[i]=prefix[i-1]+arr.get(i);
        }
        int max=0;
        for(int i=0;i<arr.size();i++){
           if(i==0){
               ans.add(prefix[prefix.length-1]);
           }
           else{
               ans.add(prefix[prefix.length-1]-(prefix[i-1]) );
           }
        }*/

        //carry forward
        for(int i=0;i< arr.size();i++){
            int sum=0;
            for(int j=i;j<arr.size();j++){
                sum+=arr.get(j);
                if(sum>ans1){
                    ans1=sum;
                }
            }
        }
        System.out.println(ans1);
    }
}
