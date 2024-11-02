import java.util.*;

public class Program {
    public static void main(String[] args) {
        int A=9;
        int ans=0;
        for(int i=1;i<=A;i++){
            int count=0;
            for(int j=1;j<=A;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                ans++;
            }
        }
        System.out.println(ans);
    }
}