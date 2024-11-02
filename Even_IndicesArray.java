public class Even_IndicesArray {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6};
        int[][] Q={
                {0,5},{2,2},{4,4},{5,5}
        };
        int[] Evenpf = new int[arr.length];
        int[] ans = new int[Q.length];
        Evenpf[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(i%2==0){
                Evenpf[i]=Evenpf[i-1]+arr[i];
            }
            else {
                Evenpf[i]=Evenpf[i-1]+0;
            }
        }
        for(int j=0;j< Q.length;j++){
            int st=Q[j][0];
            int end=Q[j][1];
            if(st==0){
                ans[j]=Evenpf[end];
            }
            else {
                ans[j]=Evenpf[end]-Evenpf[st-1];
            }

        }
        for (int k=0;k< ans.length;k++){
            System.out.println(ans[k]);
        }
    }
}
