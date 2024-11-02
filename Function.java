import java.lang.reflect.Constructor;

public class Function {
    private static int n;

    public static void main(String[] args) {
        int rev = fun1(5);
        System.out.println(rev);
        int []arr ;
        arr = new int[]{1, 2, 3, 4, 5};
    }
     static int fun1(int n){
         int x;
         x = n * n; 
         return x;
    }
}