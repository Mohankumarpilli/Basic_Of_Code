import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the weather");
        char report = s.next().charAt(0);
        System.out.println("alphabet is "+report);
        /*switch (report){
            case "sunny":
                System.out.println("carry sun glass and umbrella");
                break;
            case "rainy":
                System.out.println("carry umbrella or rain court");
                break;
            default:
                System.out.println("check weather?");
                break;
        }*/
        switch (report){
            case 'a', 'u', 'e', 'i', 'o' ->{
                System.out.println("it is an Vowel: "+report);
            }
            default -> {
                System.out.println("it is not an Vowel: "+report);
            }

        }
    }
}
