public class Slide_BisGreater {
    public static void main(String[] args) {
        int[] arr={1,99,-123,45,2};
        int B=8;
        int count=0;
        int index=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<=B){
                index=i+1;
            }
            else{
                for(int j=i+1;j< arr.length;j++){
                    if(arr[j]<=B){
                        int temp=arr[j];
                        arr[j]=arr[index];
                        arr[index]=temp;
                        index++;
                        count++;
                        break;

                    }
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(count);
    }
}
