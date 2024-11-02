import java.util.Scanner;

public class branching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a value");
        int x = s.nextInt();
        /*if(x>0){
            System.out.println("given number is positive number: "+x);
        } else if (x==0) {
            System.out.println("given number is zero: "+x);
        } else {
            System.out.println("given number is negative number: "+x);
        }*/
        if(x%2==0){
            System.out.println("given number is even number: "+x);
        }
        else {
            System.out.println("given number is odd number: "+x);
        }

    }
}
