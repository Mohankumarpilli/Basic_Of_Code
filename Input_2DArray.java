

public class Input_2DArray {
    public static void main(String[] args) {
       int[] A = {3,2,1,4};
       int rev=9;

       Input_2DArray a = new Input_2DArray();
       a.rotate(A,rev);

        System.out.println("after");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]);
        }
    }
    public static void reverse(int[] arr, int start,int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public  void rotate(int[] arr, int rev){
        rev=rev%arr.length;
        int end=arr.length-1;
        reverse(arr,0,end);
        reverse(arr,0,rev-1);
        reverse(arr,rev,end);
    }
}
