import java.util.*;

public class Sum_of_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");

        int n=sc.nextInt();
        System.out.println("Enter m");
        int m=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            int sum=0;
            ArrayList<Integer> r1= new ArrayList<>();
            for(int j=0;j<m;j++){
                int val= sc.nextInt();
                r1.add(val);

                sum=sum+ r1.get(i);
            }
            arr.add(r1);
        }

        System.out.println(arr);






    }
}
