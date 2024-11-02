import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter an number: ");
        int x=s.nextInt();
        String out = x%2==0?"EVEN":"ODD";
        System.out.println("number is: "+out);
        String city = "no";
        if(x>18 && city=="india"){
            System.out.println("eligible");
        }else {
            System.out.println("not eligible");
        }
    }
}
