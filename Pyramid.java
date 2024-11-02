public class Pyramid {
    public static void main(String[] args) {
        Pyramid_Print(6);
        System.out.println();
        Reverse_Pyramid_Print(5);

    }
    public static void Pyramid_Print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Reverse_Pyramid_Print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(i-1);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
