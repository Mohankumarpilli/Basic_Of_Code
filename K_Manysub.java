public class K_Manysub {
    public static void main(String[] args) {
        int[] arr={69,64,90,108,-92,122,-178,112,57,73};
        int st=0;
        int end=4;
        int sum=0;
        int[] ans=new int[arr.length-end];
        while(end< arr.length){
            for(int i=st;i<=end;i++){
                sum = sum+arr[i];

            }
            ans[st]=sum;
            st++;
            end++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
