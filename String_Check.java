import java.lang.*;
import java.util.Objects;

public class String_Check {
    public static void main(String[] args) {
        String A="x...o.x...o";
        int n=A.length();
        int size=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            System.out.print(A.charAt(i));
            if(Objects.equals(A.charAt(i),'x')){
                for(int j=i+1;j<n;j++){
                    System.out.print(A.charAt(j));
                    if(Objects.equals(A.charAt(i),'o')){
                        size=j-i;
                        System.out.println(size);
                    }
                    if(size<ans){
                        ans=size;
                    }
                }
            }
            if(Objects.equals(A.charAt(i),'o')){
                for(int j=i;j<n;j++){
                    if(Objects.equals(A.charAt(i),'x')){
                        size=j-i;
                    }
                    if(size<ans){
                        ans=size;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
