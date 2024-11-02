import java.util.Scanner;

public class AliceAndSong {
    public static int maxFavouriteSongs(String S, int K) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < K; i++) {
            if (S.charAt(i) == 'a') {
                currentCount++;
            }
        }
        maxCount = currentCount;

        for (int i = K; i < S.length(); i++) {
            if (S.charAt(i - K) == 'a') {
                currentCount--;
            }
            if (S.charAt(i) == 'a') {
                currentCount++;
            }
            maxCount = Math.max(maxCount, currentCount);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string of songs (S): ");
        String input1 = scanner.nextLine();

        System.out.print("Enter the value of K: ");
        int input2 = scanner.nextInt();

        int result = maxFavouriteSongs(input1, input2);
        System.out.println("Output: " + result);
    }
}
