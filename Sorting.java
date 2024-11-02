import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sorting {
    public static void main(String[] args) {
//        int[] nums = {10,4,8,3};
//        int[] left = new int[nums.length];
//        int[] right = new int[nums.length];
//        left[0]=0;
//        int j=1;
//        for(int i=0;i<left.length-1;i++){
//            left[j]=left[i]+nums[i];
//            j++;
//        }
//        for(int i=0;i<left.length;i++){
//            System.out.println(left[i]);
//        }
//        j=nums.length-2;
//        right[nums.length-1]=0;
//        for(int i= nums.length-1;i>0;i--){
//            right[j]=nums[i]+right[j+1];
//            j--;
//        }
//        for(int i=0;i<left.length;i++){
//            System.out.print(right[i]);
//        }
//        int[] ans = new int[left.length];
//        for(int i=0;i<left.length;i++){
//            ans[i]=left[i]+right[i];
//        }
//        System.out.println();
//        for(int i=0;i<left.length;i++){
//            System.out.print(ans[i]+" ");
//        }
//        int[][] points = {{8,7},{9,9},{7,4},{9,7}};
//        Arrays.sort(points, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                int n1=o1.length;
//                int n2=o2.length;
//                for(int i=0;i<Math.min(n1,n2);i++){
//                    if(o1[i]!=o2[i]){
//                        if(o1[i]<o2[i]){
//                            return -1;
//                        }else{
//                            return 1;
//                        }
//                    }
//                }
//                if(n1<=n2){
//                    return -1;
//                }else{
//                    return 1;
//                }
//            }
//        });
//        for(int i=0;i<points.length;i++){
//
//            System.out.print(points[i][0]+"     "+points[i][1]);
//            System.out.println();
//        }
//        int ans=0;
//        for(int i=1;i<points.length;i++){
//            ans=Math.max((points[i][0]-points[i-1][0]),ans);
//        }
//        System.out.println(ans);

//        int A=30;
//        int B=12;
//        ArrayList<Integer> hcf = new ArrayList<>();
//        int ans=gcd(A,B,hcf);
//        System.out.println(hcf);
        int[] A = {6,3,3,6,7,8,7,3,7};
        int max=0;
        for(int i=0;i<A.length;i++){
            max=Math.max(max,A[i]);
        }
        int[] fre = new int[max+1];
        for(int i=0;i<A.length;i++){
            fre[A[i]]++;
        }
        int k=0;
        for(int i=0;i<fre.length;i++){
            for(int j=1;j<=fre[i];j++){
                A[k]=i;
                k++;
            }
        }
        for(int i=0;i<fre.length;i++){
            System.out.print(fre[i]+"  ");
        }
        System.out.println();
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+"  ");
        }
    }
    public static int gcd(int A, int B, ArrayList<Integer> ans){
        if(B==0){
            return A;
        }
        ans.add(B);
        return gcd(B,A%B,ans);
    }
}
