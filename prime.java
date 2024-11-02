import java.util.HashMap;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        sc.close();
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.getOrDefault(807,879);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
