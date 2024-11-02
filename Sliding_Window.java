public class Sliding_Window {
    public static void main(String[] args) {
       int sum=0;
       int k=5;
       int end=k;
       int st=1;
       int[] arr={1,2,3,4,5,6,7,8,9,10};
       int ans=Integer.MIN_VALUE;
       for(int i=0;i<k;i++){
           sum=sum+arr[i];
       }
       ans=sum+arr[end+1]-arr[st];
        System.out.println(ans);
        System.out.println(sum);
       while (end< arr.length){
           ans=sum+(arr[end])-(arr[st-1]);
           st++;
           end++;
       }
        System.out.println(ans);
    }
}
