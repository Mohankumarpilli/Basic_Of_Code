import java.util.HashMap;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] marks = {30, 5, 67, 23, 89};
        int i;
        for (i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        int[] marl = new int[5];
        int j;
        for (j = 0; j < marl.length; j++) {
            System.out.println("enter arr value");
            marl[j] = s.nextInt();
        }
        for (j = 0; j < marl.length; j++) {
            System.out.println(marl[j]);
        }

    }

}
