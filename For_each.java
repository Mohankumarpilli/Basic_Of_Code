public class For_each {
    public static void main(String[] args) {
        int k=1;
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;
        for(int i=0;i<k;i++){
            int last = arr[n-1];
            for(int j=n-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=last;
        }
        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]);
        }
    }
}
