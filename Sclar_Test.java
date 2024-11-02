import java.util.ArrayList;
import java.util.Objects;

public class Sclar_Test {
    public static void main(String[] args) {
        /*int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int [] arr={1,2,3,4,5,6};
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            else{
                if(arr[i]<min){
                    min=arr[i];
                }
            }
        }
        int ans=max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(ans);*/
       /* int count=0;
        int[] A={1,1,1};
        int B=2;
        int sum=0;
        for(int i=0;i< A.length-1;i++){
            sum=A[i]+A[i+1];
            if(sum==B){
                count++;
            }
        }
        System.out.println(count);*/
        /*ArrayList<Integer> arrlist12 = new ArrayList<Integer>();
        int[] A={1,1,1,2,3};
        int[] B={1,2,3,4,5};
        for (int value : A) {
            for (int i : B) {
                if (value == i) {
                    arrlist12.add(value);
                }
            }
        }
        System.out.println(arrlist12);
        for(int k=0;k< arrlist12.size();k++){
            for (int l=k+1;l< arrlist12.size();l++){
                if(Objects.equals(arrlist12.get(k), arrlist12.get(l))){
                    arrlist12.remove(l);
                }
            }
        }
        System.out.println(arrlist12);*/
        int ans=0;
        int A=3;
        int B=3;
        int C=1;
        int N=1;
        for(int i=0;i<B;i++){
            N=N*A;
        }
        System.out.println(N);
        ans=A%C;
        System.out.println(ans);
    }
}
