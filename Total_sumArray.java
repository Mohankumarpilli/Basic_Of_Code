public class Total_sumArray {
    public static void main(String[] args) {
        int[] arr={6,8,-1,7};
        int n= arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int sum=(i+1)*(n-i);
            ans+=arr[i]*sum;
        }
        System.out.println(ans);
    }
}
