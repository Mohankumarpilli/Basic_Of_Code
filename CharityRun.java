import java.util.Scanner;

public class CharityRun {
    public static int sumEvenKilometers(int N) {
        int sum = 0;

        // Loop through numbers from 1 to N
        for (int i = 1; i <= N; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumEvenKilometers(n));
    }
}

