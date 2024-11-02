import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int [] arr = new int[5];

        int j;
        for(j = 0; j < arr.length; j++){
            System.out.println("enter arr value");
            arr[j]=s.nextInt();
        }
        System.out.println("enter the search element:");
        int key = s.nextInt();
        int res = -1;
        for (int i =1; i < arr.length; i++){
            if(key == arr[i]){
                res=i;
                break;
            }
        }
        if(res > -1){
            System.out.println("the ele index value is:"+res);
        }else {
            System.out.println("the ele not found");
        }
    }
}
